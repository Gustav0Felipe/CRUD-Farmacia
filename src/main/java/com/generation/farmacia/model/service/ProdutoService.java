package com.generation.farmacia.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.farmacia.model.Produto;
import com.generation.farmacia.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public List<Produto>porFreteEntre(Float max) {
		
		return produtoRepository.findAllByEntregaLessThan(max);
	}
	
}
