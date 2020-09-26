package com.oto.despachante.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.oto.despachante.domain.Cliente;
import com.oto.despachante.domain.dto.ClienteDTO;
import com.oto.despachante.repository.ClienteRepository;
import com.oto.despachante.repository.VeiculoRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository rep;
	
	@Autowired
	private VeiculoRepository veiculoRep;

	public List<ClienteDTO> buscarTodos() {
		return rep.findAll().stream().map(ClienteDTO::create).collect(Collectors.toList());
	}

	public ClienteDTO insert(Cliente cliente) {
		return ClienteDTO.create(rep.save(cliente));
	}

	public Optional<ClienteDTO> getClienteById(Long id) {
		return rep.findById(id).map(ClienteDTO::create);
	}

	public ClienteDTO update(Cliente cliente, Long id) {
		Assert.notNull(id, "Não foi possível atualizar o registro!");

		// Busca o Registro no banco de dados
		Optional<Cliente> optional = rep.findById(id);
		if (optional.isPresent()) {
			Cliente db = optional.get();
			// Copiar as propriedades
			db.setCel(cliente.getCel());
			db.setCep(cliente.getCep());
			db.setCidade(cliente.getCidade());
			db.setCnh(cliente.getCnh());
			db.setCnhdata(cliente.getCnhdata());
			db.setCnhtipo(cliente.getCnhtipo());
			db.setCpfcnpj(cliente.getCpfcnpj());
			db.setEmail(cliente.getEmail());
			db.setEndereco(cliente.getEndereco());
			db.setNome(cliente.getNome());
			db.setRg(cliente.getRg());
			db.setTel(cliente.getTel());
			db.setTipo(cliente.getTipo());
			db.setListaVeiculos(cliente.getListaVeiculos());
			// Atualiza o Cliente
			rep.save(db);

			return ClienteDTO.create(db);
		}
		return null;

	}

	public Cliente save(Cliente cliente) {
		return rep.save(cliente);
	}

	public boolean delete(Long id) {
		if (getClienteById(id).isPresent()) {
			rep.deleteById(id);
			return true;
		}
		return false;
	}

}
