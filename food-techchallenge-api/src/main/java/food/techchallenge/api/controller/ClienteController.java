package food.techchallenge.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import food.techchallenge.api.domain.cliente.interfaces.service.IClienteService;
import food.techchallenge.api.domain.cliente.model.Cliente;

import java.util.List;

//import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	IClienteService _clienteService;

	public ClienteController(IClienteService clienteService) {
		this._clienteService = clienteService;
	}

	//@ApiOperation(value = "Endpoint Salvar Pessoas")

	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody Cliente cliente) {

		_clienteService.cadastrarCliente(cliente);
	}

    @GetMapping("/listar")
    public @ResponseBody List<Cliente> listar(){
       
        return _clienteService.listar();
    }

}
