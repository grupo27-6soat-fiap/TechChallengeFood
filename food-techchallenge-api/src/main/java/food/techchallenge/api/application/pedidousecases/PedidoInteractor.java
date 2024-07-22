package food.techchallenge.api.application.pedidousecases;

import java.util.List;

import food.techchallenge.api.application.gateways.PedidoGateway;
import food.techchallenge.api.domain.pedido.entity.Pedido;

public class PedidoInteractor { 

    private PedidoGateway pedidoGateway;
    
    public PedidoInteractor(PedidoGateway pedidoGateway) {
        this.pedidoGateway = pedidoGateway;
    }

    public void cadastrarPedido(Pedido pedido){
        pedidoGateway.cadastrarPedido(pedido);
    }

    public void checkoutPedido(Pedido pedido){
        pedidoGateway.checkoutPedido(pedido);
    }

    public List<Pedido> listarPedidos(){
        return pedidoGateway.listarPedidos();
    }
    
}
