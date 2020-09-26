package com.oto.despachante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oto.despachante.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
