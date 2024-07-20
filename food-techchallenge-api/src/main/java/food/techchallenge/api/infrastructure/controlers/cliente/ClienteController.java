package food.techchallenge.api.infrastructure.controlers.cliente;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.application.clienteusecases.ClienteInteractor;
import food.techchallenge.api.domain.cliente.entity.Cliente;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

//import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	private ClienteInteractor clienteInteractor;

	public ClienteController(ClienteInteractor clienteInteractor) {
		this.clienteInteractor = clienteInteractor;
	}

	//@ApiOperation(value = "Endpoint Salvar Pessoas")
	@Operation(summary = "Cadastrar Cliente")
	@ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Cliente cadastrado com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class)) }),
	@ApiResponse(responseCode = "400", description = "Parâmetros Inválidos", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class)) }),
  	@ApiResponse(responseCode = "500", description = "Internal Error", content = @Content), 
	@ApiResponse(responseCode = "409", description = "Cliente já cadastrado", content = @Content), 
  	@ApiResponse(responseCode = "404", description = "Erro", content = @Content) })
	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody Cliente cliente) {
		clienteInteractor.cadastrarCliente(cliente);
	}

	@Operation(summary = "Lista todos os Clientes")
	@ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Clientes listados com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class)) }),
  	@ApiResponse(responseCode = "400", description = "", content = @Content)})
    @GetMapping("/listar")
    public @ResponseBody List<Cliente> listar(){
        // System.out.println("FR - Listar Todos");
        return clienteInteractor.listar();
    }

	@Operation(summary = "Obtém cliente por CPF")
	@ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Clientes listados com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class)) }),
	@ApiResponse(responseCode = "404", description = "Clientes não encontrado", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Cliente.class)) }),
  	@ApiResponse(responseCode = "400", description = "", content = @Content)})
    @GetMapping("/{id}")
    public @ResponseBody Cliente consultaCliente(@PathVariable("id")String cpf){
       
        return clienteInteractor.consultaCliente(cpf); 
    }

}
