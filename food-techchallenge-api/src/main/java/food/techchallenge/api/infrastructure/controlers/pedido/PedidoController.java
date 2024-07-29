package food.techchallenge.api.infrastructure.controlers.pedido;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.application.pedidousecases.PedidoInteractor;
import food.techchallenge.api.domain.pedido.entity.Pedido;
import food.techchallenge.api.domain.pedido.entity.PedidoPagamento;
import food.techchallenge.api.domain.pedido.enums.StatusPedido;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private PedidoInteractor pedidoInteractor;
    
    public PedidoController(PedidoInteractor pedidoInteractor){
        this.pedidoInteractor = pedidoInteractor;
    }

    @Operation(summary = "Cadastrar Pedido")
	@ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Pedido cadastrado com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Pedido.class)) }),
  	@ApiResponse(responseCode = "500", description = "Ocorreu um erro ao cadastrar o pedido", content = @Content), 
  	@ApiResponse(responseCode = "404", description = "Erro", content = @Content) })
	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody Pedido pedido) {

		pedidoInteractor.cadastrarPedido(pedido);
	}

	@Operation(summary = "Checkout do Pedido")
	@ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Checkout realizado com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Pedido.class)) }),
  	@ApiResponse(responseCode = "500", description = "Ocorreu um erro ao realizar o checkout do pedido", content = @Content), 
  	@ApiResponse(responseCode = "404", description = "Erro", content = @Content) })
	@PutMapping("/checkout")
	public @ResponseBody PedidoPagamento checkout(@RequestBody Pedido pedido) {

		return pedidoInteractor.checkoutPedido(pedido);
		 
	}

	@Operation(summary = "Lista todos os Pedidos")
	@ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Pedidos listados com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Pedido.class)) }),
  	@ApiResponse(responseCode = "400", description = "", content = @Content)})
    @GetMapping("/listar")
    public @ResponseBody List<Pedido> listar(){
       
        return pedidoInteractor.listarPedidos();
    }

	@Operation(summary = "Atualizar Status")
	@ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Status atualizado com sucesso", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Pedido.class)) }),
  	@ApiResponse(responseCode = "500", description = "Ocorreu um erro ao atualizar o status do pedido", content = @Content), 
  	@ApiResponse(responseCode = "404", description = "Erro", content = @Content) })
	@PutMapping("/atualizar")
	public @ResponseBody Pedido atualizarStatus(@RequestBody Pedido pedido, StatusPedido statusPedido) {

		pedidoInteractor.atualizarStatus(pedido, statusPedido);
		return pedido;
	}


}
