package com.oto.despachante.domain.dto;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.oto.despachante.domain.Cliente;
import com.oto.despachante.domain.OrdemServico;
import com.oto.despachante.domain.Servico;
import com.oto.despachante.domain.Usuario;

public class OrdemServicoDTO {

	private Long id;
	private Cliente cliente;
	private Usuario usuario;
	private Usuario despachante;
	private Date dataRegistro;
	private Date dataEmissao;
	private String numProcesso;
	private Double valorTotal;
	private Double desconto;
	private Double valorSinal;
	private List<Servico> listaServicos;
	
	public static OrdemServicoDTO create(OrdemServico os) {
		ModelMapper mp = new ModelMapper();
		return mp.map(os, OrdemServicoDTO.class);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Usuario getDespachante() {
		return despachante;
	}
	public void setDespachante(Usuario despachante) {
		this.despachante = despachante;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getNumProcesso() {
		return numProcesso;
	}
	public void setNumProcesso(String numProcesso) {
		this.numProcesso = numProcesso;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getValorSinal() {
		return valorSinal;
	}
	public void setValorSinal(Double valorSinal) {
		this.valorSinal = valorSinal;
	}
	public List<Servico> getListaServicos() {
		return listaServicos;
	}
	public void setListaServicos(List<Servico> listaServicos) {
		this.listaServicos = listaServicos;
	}
}
