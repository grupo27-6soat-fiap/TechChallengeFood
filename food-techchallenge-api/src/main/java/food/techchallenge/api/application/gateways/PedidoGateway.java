package food.techchallenge.api.application.gateways;


import java.util.List;

import food.techchallenge.api.domain.pedido.entity.Pedido;

public interface PedidoGateway {

    void cadastrarPedido(Pedido pedido);

     void checkoutPedido(Pedido pedido);

     List<Pedido> listarPedidos();

}
