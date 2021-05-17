package com.oto.despachante.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oto.despachante.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	List<Cliente> findByNomeIgnoreCaseContaining(String nome);
	@Query("SELECT DISTINCT c FROM Cliente c INNER JOIN c.listaVeiculos v where v.placa = :placa")
	Optional<Cliente> findByPlacaVeiculo(String placa);
}
