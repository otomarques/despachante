package com.oto.despachante.utils;

import org.modelmapper.ModelMapper;

import com.oto.despachante.domain.Orcamento;
import com.oto.despachante.domain.OrdemServico;

public class OrcamentoUtils {

	public static OrdemServico createOS(Orcamento orcamento) {
		ModelMapper mp = new ModelMapper();
		return mp.map(orcamento, OrdemServico.class);
	}

}
