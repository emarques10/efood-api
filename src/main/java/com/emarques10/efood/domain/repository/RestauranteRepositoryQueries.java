package com.emarques10.efood.domain.repository;

import java.math.BigDecimal;
import java.util.List;

import com.emarques10.efood.domain.model.Restaurante;

public interface RestauranteRepositoryQueries {

	List<Restaurante> find(String nome, 
			BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal);
	
	List<Restaurante> findComFreteGratis(String nome);

}