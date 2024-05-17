package food.techchallenge.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.domain.cliente.entity.Cliente;
import food.techchallenge.api.domain.cliente.interfaces.repository.IClienteRepository;
import food.techchallenge.api.domain.cliente.vo.DadosCadastroCliente;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    //IClienteService _clienteService;
    IClienteRepository clienteRepository;

    @ApiOperation(value = "Endpoint Cadastrar Cliente")
    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody DadosCadastroCliente dados){
       
        clienteRepository.save(new Cliente(dados));
    }
    
    @ApiOperation(value = "Consulta todos os clientes")
    @GetMapping("/obterTodosCliente")
    public @ResponseBody Iterable<Cliente> getAllClientes() {
       
        return clienteRepository.findAll();
    }
    
    @ApiOperation(value = "Endpoint Consulta Clientes")
    @GetMapping("/obterCliente")
    public @ResponseBody Iterable<Cliente> getCliente(@RequestParam String cpf) {
        return clienteRepository.findByCpf(cpf);
    }


}
