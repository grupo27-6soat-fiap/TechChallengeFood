package com.fiap.TechChallengeFood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fiap.TechChallengeFood.model.Cliente;
import com.fiap.TechChallengeFood.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
    @PostMapping("/cadastrar")
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
    	
        if(!(cliente.getNome().equals("")) && !(cliente.getCpf().equals(""))){
        	
        	clienteRepository.save(cliente);
        	cliente.setStatus("Cliente cadastrado com sucesso!");
        	
        } else {
        	
        	cliente.setId((long)(0));
        	cliente.setStatus("Falha no cadastrado do cliente, dados não preenchidos!");
        }
        
        return cliente;
        
    }

}