package com.oto.despachante.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oto.despachante.domain.Usuario;
import com.oto.despachante.domain.dto.UsuarioDTO;
import com.oto.despachante.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository rep;

	public List<UsuarioDTO> buscarTodos() {
		return rep.findAll().stream().map(UsuarioDTO::create).collect(Collectors.toList());
	}
	
	public UsuarioDTO insert(Usuario usuario) {
		if(usuario == null) {
			throw new IllegalArgumentException("Usuário não pode ser nulo.");
		}
		return UsuarioDTO.create(rep.save(usuario));
	}
	
	
}
