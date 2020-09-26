package com.oto.despachante.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

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
		return UsuarioDTO.create(rep.save(usuario));
	}
	
	public Optional<UsuarioDTO> getUsuarioById(Long id) {
		return rep.findById(id).map(UsuarioDTO::create);
	}


	public List<UsuarioDTO> getUsuarioByLogin(String login) {
		return rep.findByLogin(login).stream().map(UsuarioDTO::create).collect(Collectors.toList());
	}

	public UsuarioDTO update(Usuario usuario, Long id) {
		Assert.notNull(id, "Não foi possível atualizar o registro!");
		
		//Busca o Registro no banco de dados
		Optional<Usuario> optional = rep.findById(id);
		if(optional.isPresent()) {
			Usuario db = optional.get();
			//Copiar as propriedades
			db.setLogin(usuario.getLogin());
			db.setNome(usuario.getNome());
			db.setSenha(usuario.getSenha());
			//Atualiza o Usuario
			rep.save(db);
			
			return UsuarioDTO.create(db);
		}
			return null;
		
	}
	public Usuario save(Usuario usuario) {
		return rep.save(usuario);
	}


	public boolean delete(Long id) {
		if(getUsuarioById(id).isPresent()) {
			rep.deleteById(id);
			return true;
		}
		return false;
	}
	
}
