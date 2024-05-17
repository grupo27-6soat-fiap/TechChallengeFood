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

import food.techchallenge.api.infraestrutura.entity.ClienteEntity;

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

	/*@ApiOperation(value = "Consulta todos os clientes")
	@GetMapping("/obterTodosCliente")
	public @ResponseBody Iterable<Cliente> getAllClientes() {

		//return clienteRepository.findAll();
	}

	@ApiOperation(value = "Endpoint Consulta Clientes")
	@GetMapping("/obterCliente")
	public @ResponseBody Iterable<Cliente> getCliente(@RequestParam String cpf) {
		return clienteRepository.findByCpf(cpf);
	}*/

}
