package com.oto.despachante.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oto.despachante.domain.Orcamento;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {
	@Query(value = "from Orcamento t where t.dataEmissao BETWEEN :startDate AND :endDate order by t.dataEmissao")
	List<Orcamento> getAllBetweenDates(@Param("startDate")Date startDate,@Param("endDate")Date endDate);
}
