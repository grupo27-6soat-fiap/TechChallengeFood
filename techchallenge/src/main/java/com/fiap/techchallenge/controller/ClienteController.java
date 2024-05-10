package com.fiap.techchallenge.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.*;
import com.fiap.techchallenge.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @PostMapping("/cadastrar")
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
    	
    	//FIRULA PRA GERAR UM CODIGO DO CLIENTE
    	//NECESSARIO ALTERAR PARA GERACAO DE ID BANCO DE DADOS
    	long leftLimit = 1L;
        long rightLimit = 100L;
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));      
        //FIRULA PRA GERAR UM CODIGO DO CLIENTE
        
        if(!(cliente.getNome().equals("")) && !(cliente.getCpf().equals(""))){
        	cliente.setStatus("Cliente cadastrado com sucesso!");
        	 cliente.setId(generatedLong); 
        } else {
        	cliente.setStatus("Falha no cadastrado do cliente, dados não preenchidos!");
        	cliente.setId((long) 0); 
        }
        
        return cliente;
        
    }
}