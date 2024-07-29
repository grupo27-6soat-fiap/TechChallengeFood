package food.techchallenge.api.application.pedidousecases;

import java.util.List;

import food.techchallenge.api.application.gateways.PedidoGateway;
import food.techchallenge.api.domain.pedido.entity.Pedido;
import food.techchallenge.api.domain.pedido.entity.PedidoPagamento;
import food.techchallenge.api.domain.pedido.enums.StatusPedido;
import food.techchallenge.api.domain.webhook.WebhookPayload;

public class PedidoInteractor { 

    private PedidoGateway pedidoGateway;
    
    public PedidoInteractor(PedidoGateway pedidoGateway) {
        this.pedidoGateway = pedidoGateway;
    }

    public void cadastrarPedido(Pedido pedido){
        pedidoGateway.cadastrarPedido(pedido);
    }

    public PedidoPagamento checkoutPedido(Pedido pedido){
        return pedidoGateway.checkoutPedido(pedido);
    }

    public List<Pedido> listarPedidos(){
        return pedidoGateway.listarPedidos();
    }

    public void confirmarPagamento(WebhookPayload webhookPayload){
        pedidoGateway.confirmarPagamento(webhookPayload);

    }

    public void atualizarStatus(Pedido pedido, StatusPedido statusPedido){
        pedidoGateway.atualizarStatus(pedido.getId(), statusPedido);
    }
    
}
