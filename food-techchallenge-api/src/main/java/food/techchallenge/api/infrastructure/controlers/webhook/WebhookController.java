package food.techchallenge.api.infrastructure.controlers.webhook;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.application.pedidousecases.PedidoInteractor;
import food.techchallenge.api.domain.webhook.WebhookPayload;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private PedidoInteractor pedidoInteractor;

    public WebhookController(PedidoInteractor pedidoInteractor){
        this.pedidoInteractor = pedidoInteractor;
    }

    @Operation(summary = "Webhook Pagamento")
	@ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Pagamento Processado", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = WebhookPayload.class)) }),
  	@ApiResponse(responseCode = "500", description = "Ocorreu um erro ao processar o pagamento", content = @Content), 
  	@ApiResponse(responseCode = "404", description = "Erro", content = @Content) })
    @PostMapping("/pagamento")
    public void handleWebhook(@RequestBody WebhookPayload payload) {
        System.out.println("Recebi um webhook!");
        System.out.println("Status: " + payload.getStatus());
        System.out.println("ID do pedido: " + payload.getIdPedido());
        pedidoInteractor.confirmarPagamento(payload);
        
    }

}
