package com.oto.despachante.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Orcamento implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "idcliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "idusuario")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name = "iddespachante")
	private Usuario despachante;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "pt-BR", timezone = "Brazil/East")
	@Temporal(TemporalType.DATE)
	private Date dataRegistro;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "pt-BR", timezone = "Brazil/East")
	@Temporal(TemporalType.DATE)
	private Date dataEmissao;
	private String numProcesso;
	private Double valorTotal;
	private Double desconto;
	private Double valorSinal;
	
	@ManyToMany
	private List<Servico> listaServicos;
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orcamento other = (Orcamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
