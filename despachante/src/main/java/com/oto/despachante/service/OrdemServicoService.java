package com.oto.despachante.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.oto.despachante.domain.OrdemServico;
import com.oto.despachante.domain.dto.OrdemServicoDTO;
import com.oto.despachante.repository.OrdemServicoRepository;

@Service
public class OrdemServicoService {
	@Autowired
	private OrdemServicoRepository rep;

	public List<OrdemServicoDTO> buscarTodos() {
		return rep.findAll().stream().map(OrdemServicoDTO::create).collect(Collectors.toList());
	}

	public Optional<OrdemServicoDTO> getOrdemServicoById(Long id) {
		return rep.findById(id).map(OrdemServicoDTO::create);
	}

	public List<OrdemServicoDTO> getOrdemServicoByPeriodo(Date dataIni, Date dataFim) {
		return rep.getAllBetweenDates(dataIni, dataFim).stream().map(OrdemServicoDTO::create)
				.collect(Collectors.toList());
	}

	public OrdemServicoDTO insert(OrdemServico orcamento) {
		rep.flush();
		return OrdemServicoDTO.create(rep.save(orcamento));
	}

	public OrdemServicoDTO update(OrdemServico orcamento, Long id) {
		Assert.notNull(id, "Não foi possível atualizar o registro!");

		Optional<OrdemServico> optional = rep.findById(id);
		if (optional.isPresent()) {
			OrdemServico db = optional.get();
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

			return OrdemServicoDTO.create(db);
		}
		return null;

	}

	public OrdemServico save(OrdemServico orcamento) {
		return rep.save(orcamento);
	}

	public void delete(Long id) {
		rep.deleteById(id);
	}
}
