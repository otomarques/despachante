package com.oto.despachante.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.oto.despachante.domain.Servico;
import com.oto.despachante.domain.dto.ServicoDTO;
import com.oto.despachante.repository.ServicoRepository;

@Service
public class ServicoService {
	@Autowired
	private ServicoRepository rep;

	public List<ServicoDTO> buscarTodos() {
		return rep.findAll().stream().map(ServicoDTO::create).collect(Collectors.toList());
	}
	
	public ServicoDTO insert(Servico servico) {
		return ServicoDTO.create(rep.save(servico));
	}
	
	public Optional<ServicoDTO> getServicoById(Long id) {
		return rep.findById(id).map(ServicoDTO::create);
	}


	public List<ServicoDTO> getServicoByDescricao(String descricao) {
		return rep.findByDescricaoContains(descricao).stream().map(ServicoDTO::create).collect(Collectors.toList());
	}

	public ServicoDTO update(Servico servico, Long id) {
		Assert.notNull(id, "Não foi possível atualizar o registro!");
		
		//Busca o Registro no banco de dados
		Optional<Servico> optional = rep.findById(id);
		if(optional.isPresent()) {
			Servico db = optional.get();
			//Copiar as propriedades
			db.setDescricao(servico.getDescricao());
			db.setValor(servico.getValor());
			//Atualiza o Servico
			rep.save(db);
			
			return ServicoDTO.create(db);
		}
			return null;
		
	}
	public Servico save(Servico servico) {
		return rep.save(servico);
	}


	public boolean delete(Long id) {
		if(getServicoById(id).isPresent()) {
			rep.deleteById(id);
			return true;
		}
		return false;
	}
}
