package food.techchallenge.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.domain.cliente.entity.Cliente;
import food.techchallenge.api.domain.cliente.interfaces.repository.IClienteRepository;
import food.techchallenge.api.domain.cliente.vo.DadosCadastroCliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    //IClienteService _clienteService;
    IClienteRepository clienteRepository;

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody DadosCadastroCliente dados){
       
        clienteRepository.save(new Cliente(dados));
    }

}
