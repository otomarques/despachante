package com.oto.despachante.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.oto.despachante.domain.Veiculo;
import com.oto.despachante.domain.dto.VeiculoDTO;
import com.oto.despachante.repository.VeiculoRepository;

@Service
public class VeiculoService {
	@Autowired
	private VeiculoRepository rep;

	public List<VeiculoDTO> buscarTodos() {
		return rep.findAll().stream().map(VeiculoDTO::create).collect(Collectors.toList());
	}

	public VeiculoDTO insert(Veiculo veiculo) {
		return VeiculoDTO.create(rep.save(veiculo));
	}

	public Optional<VeiculoDTO> getVeiculoById(Long id) {
		return rep.findById(id).map(VeiculoDTO::create);
	}

	public VeiculoDTO update(Veiculo veiculo, Long id) {
		Assert.notNull(id, "Não foi possível atualizar o registro!");

		// Busca o Registro no banco de dados
		Optional<Veiculo> optional = rep.findById(id);
		if (optional.isPresent()) {
			Veiculo db = optional.get();
			// Copiar as propriedades
			db.setAno(veiculo.getAno());
			db.setChassi(veiculo.getChassi());
			db.setModelo(veiculo.getModelo());
			db.setNumMotor(veiculo.getNumMotor());
			db.setPlaca(veiculo.getPlaca());
			db.setRenavan(veiculo.getRenavan());
			// Atualiza o Veiculo
			rep.save(db);

			return VeiculoDTO.create(db);
		}
		return null;

	}

	public Veiculo save(Veiculo veiculo) {
		return rep.save(veiculo);
	}

	public void delete(Long id) {
		rep.deleteById(id);
	}
}
