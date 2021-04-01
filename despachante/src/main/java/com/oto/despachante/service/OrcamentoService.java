package com.oto.despachante.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.oto.despachante.domain.Orcamento;
import com.oto.despachante.domain.dto.OrcamentoDTO;
import com.oto.despachante.repository.OrcamentoRepository;

@Service
public class OrcamentoService {
	@Autowired
	private OrcamentoRepository rep;

	public List<OrcamentoDTO> buscarTodos() {
		return rep.findAll().stream().map(OrcamentoDTO::create).collect(Collectors.toList());
	}

	public Optional<OrcamentoDTO> getOrcamentoById(Long id) {
		return rep.findById(id).map(OrcamentoDTO::create);
	}

	public List<OrcamentoDTO> getOrcamentoByPeriodo(Date dataIni, Date dataFim) {
		return rep.getAllBetweenDates(dataIni, dataFim).stream().map(OrcamentoDTO::create).collect(Collectors.toList());
	}

	public OrcamentoDTO insert(Orcamento orcamento) {
		rep.flush();
		return OrcamentoDTO.create(rep.save(orcamento));
	}

	public OrcamentoDTO update(Orcamento orcamento, Long id) {
		Assert.notNull(id, "Não foi possível atualizar o registro!");

		Optional<Orcamento> optional = rep.findById(id);
		if (optional.isPresent()) {
			Orcamento db = optional.get();
			db.setDataRegistro(orcamento.getDataRegistro());
			db.setCliente(orcamento.getCliente());
			db.setUsuario(orcamento.getUsuario());
			db.setDataEmissao(orcamento.getDataEmissao());
			db.setDesconto(orcamento.getDesconto());
			db.setDespachante(orcamento.getDespachante());
			db.setListaServicos(orcamento.getListaServicos());
			db.setNumProcesso(orcamento.getNumProcesso());
			db.setValorSinal(orcamento.getValorSinal());
			db.setValorTotal(orcamento.getValorTotal());
			rep.save(db);

			return OrcamentoDTO.create(db);
		}
		return null;

	}

	public Orcamento save(Orcamento orcamento) {
		return rep.save(orcamento);
	}

	public void delete(Long id) {
		rep.deleteById(id);
	}
}
