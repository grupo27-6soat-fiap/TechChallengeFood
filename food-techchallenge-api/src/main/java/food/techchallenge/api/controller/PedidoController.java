package food.techchallenge.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import food.techchallenge.api.domain.pedido.interfaces.repository.IPedidoRepository;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    IPedidoRepository iPedidoRepository;


}
