package food.techchallenge.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.domain.cliente.interfaces.repository.IClienteRepository;
import food.techchallenge.api.domain.cliente.interfaces.service.IClienteService;
import food.techchallenge.api.domain.cliente.model.Cliente;
import food.techchallenge.api.domain.cliente.vo.DadosCadastroCliente;
<<<<<<< HEAD
=======
import food.techchallenge.api.infraestrutura.entity.ClienteEntity;
>>>>>>> 31b3274ec5da80df098d74fae64553f7aac043f5
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

  

<<<<<<< HEAD
    @ApiOperation(value = "Endpoint Cadastrar Cliente")
=======
    IClienteService _clienteService;

    
    public ClienteController(IClienteService clienteService) {
        this._clienteService = clienteService;
    }

    @ApiOperation(value = "Endpoint Salvar Pessoas")
>>>>>>> 31b3274ec5da80df098d74fae64553f7aac043f5
    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody Cliente cliente){
       
        _clienteService.cadastrarCliente(cliente);
    }
<<<<<<< HEAD
    
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
=======

>>>>>>> 31b3274ec5da80df098d74fae64553f7aac043f5


}
