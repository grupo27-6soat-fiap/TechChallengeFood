package food.techchallenge.api.application.gateways;

import java.util.List;

import food.techchallenge.api.domain.pedido.entity.Pedido;
import food.techchallenge.api.domain.pedido.entity.PedidoPagamento;
import food.techchallenge.api.domain.pedido.enums.StatusPedido;
import food.techchallenge.api.domain.webhook.WebhookPayload;

public interface PedidoGateway {

    void cadastrarPedido(Pedido pedido);

    PedidoPagamento checkoutPedido(Pedido pedido);

    List<Pedido> listarPedidos();

    void confirmarPagamento(WebhookPayload webhookPayload);

    void atualizarStatus(Long idPedido, StatusPedido statusPedido);

}
