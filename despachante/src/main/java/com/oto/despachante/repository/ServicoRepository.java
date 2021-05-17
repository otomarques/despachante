package com.oto.despachante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oto.despachante.domain.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long>{
	List<Servico> findByDescricaoContains(String descricao);
}
