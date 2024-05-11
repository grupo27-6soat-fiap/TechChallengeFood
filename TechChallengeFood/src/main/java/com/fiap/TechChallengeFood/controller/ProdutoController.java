package com.fiap.TechChallengeFood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.TechChallengeFood.model.Produto;
import com.fiap.TechChallengeFood.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@SuppressWarnings("static-access")
	@PostMapping("/cadastrar")
	public Produto cadastrarProduto(@RequestBody Produto produtos) {
		if(!(produtos.getNome().equals("")) && !(produtos.getPreco().isNaN(0)) && !(produtos.getCategoria().equals(""))) {
			produtoRepository.save(produtos);
			produtos.setSatus("Produto Cadastrado com sucesso !");
		}else {
			
			produtos.setNome(produtos.getNome());
        	produtos.setSatus("Falha ao cadastrar o produto, dados não preenchidos!");
		}
		return produtos;
	}
	
}
