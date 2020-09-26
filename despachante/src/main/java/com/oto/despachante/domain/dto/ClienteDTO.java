package com.oto.despachante.domain.dto;

import java.io.Serializable;

import org.modelmapper.ModelMapper;

import com.oto.despachante.domain.Cliente;
import com.oto.despachante.domain.enums.PessoaEnum;

public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private String cep;
	private String cidade;
	private String tel;
	private String cel;
	private PessoaEnum tipo;
	private String cpfcnpj;
	private String rg;
	private String cnh;
	private String cnhtipo;
	private String cnhdata;

	public static ClienteDTO create(Cliente cliente) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(cliente, ClienteDTO.class);

	}

	public Long getId() {
		return id;

	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public PessoaEnum getTipo() {
		return tipo;
	}

	public void setTipo(PessoaEnum tipo) {
		this.tipo = tipo;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getCnhtipo() {
		return cnhtipo;
	}

	public void setCnhtipo(String cnhtipo) {
		this.cnhtipo = cnhtipo;
	}

	public String getCnhdata() {
		return cnhdata;
	}

	public void setCnhdata(String cnhdata) {
		this.cnhdata = cnhdata;
	}

}
