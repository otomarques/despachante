package com.oto.despachante.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.oto.despachante.domain.Recibo;
import com.oto.despachante.domain.Usuario;
import com.oto.despachante.domain.dto.ReciboDTO;
import com.oto.despachante.repository.ReciboRepository;

@Service
public class ReciboService {
	@Autowired
	private ReciboRepository rep;
	
	public List<ReciboDTO> buscarTodos(){
		return rep.findAll().stream().map(ReciboDTO::create).collect(Collectors.toList());
	}
	
	public Optional<ReciboDTO> getReciboById(Long id) {
		return rep.findById(id).map(ReciboDTO::create);
	}
	
	public List<ReciboDTO> getReciboByPeriodo(Date dataIni, Date dataFim){
		return rep.getAllBetweenDates(dataIni, dataFim).stream().map(ReciboDTO::create).collect(Collectors.toList());
	}


	public ReciboDTO insert(Recibo recibo) {
		return ReciboDTO.create(rep.save(recibo));
	}


	public ReciboDTO update(Recibo recibo, Long id) {
		Assert.notNull(id, "Não foi possível atualizar o registro!");
		
		Optional<Recibo> optional = rep.findById(id);
		if(optional.isPresent()) {
			Recibo db = optional.get();
			db.setDataRegistro(recibo.getDataRegistro());
			db.setCliente(recibo.getCliente());
			db.setUsuario(recibo.getUsuario());
			db.setDataEmissao(recibo.getDataEmissao());
			db.setDesconto(recibo.getDesconto());
			db.setDespachante(recibo.getDespachante());
			db.setListaServicos(recibo.getListaServicos());
			db.setNumProcesso(recibo.getNumProcesso());
			db.setValorSinal(recibo.getValorSinal());
			db.setValorTotal(recibo.getValorTotal());
			rep.save(db);
			
			return ReciboDTO.create(db);
		}
			return null;
		
	}
	public Recibo save(Recibo recibo) {
		if(recibo == null) {
			throw new IllegalArgumentException("Recibo não pode ser nulo.");
		}
		return rep.save(recibo);
	}


	public boolean delete(Long id) {
		if(id == null) {
			throw new IllegalArgumentException("ID não pode ser nulo.");
		}
		if(getReciboById(id).isPresent()) {
			rep.deleteById(id);
			return true;
		}
		return false;
	}
}
