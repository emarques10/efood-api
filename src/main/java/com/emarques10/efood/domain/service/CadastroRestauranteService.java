package com.emarques10.efood.domain.service;

import com.emarques10.efood.domain.repository.CozinhaRepository;
import com.emarques10.efood.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emarques10.efood.domain.exception.EntidadeNaoEncontradaException;
import com.emarques10.efood.domain.model.Cozinha;
import com.emarques10.efood.domain.model.Restaurante;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		
		Cozinha cozinha = cozinhaRepository.findById(cozinhaId)
			.orElseThrow(() -> new EntidadeNaoEncontradaException(
					String.format("Não existe cadastro de cozinha com código %d", cozinhaId)));
		
		restaurante.setCozinha(cozinha);
		
		return restauranteRepository.save(restaurante);
	}
	
}
