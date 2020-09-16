package com.oto.despachante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oto.despachante.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
