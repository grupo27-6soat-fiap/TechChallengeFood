package food.techchallenge.api.domain.pedido.interfaces.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import food.techchallenge.api.domain.pedido.model.Pedido;

public interface IPedidoService {

    @Autowired
    void cadastrarPedido(Pedido pedido);

     void checkoutPedido(Pedido pedido);

     List<Pedido> listarPedidos();

    // Pedido obterPedido(Pedido pedido);

}
