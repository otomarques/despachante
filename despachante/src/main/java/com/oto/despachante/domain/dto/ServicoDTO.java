package com.oto.despachante.domain.dto;

import org.modelmapper.ModelMapper;

import com.oto.despachante.domain.Servico;

public class ServicoDTO {
	
	private Long id;
	private String descricao;
	private Double valor;
	
	public static ServicoDTO create(Servico servico) {
		ModelMapper mp = new ModelMapper();
		return mp.map(servico, ServicoDTO.class);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

}
