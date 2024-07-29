package food.techchallenge.api.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import food.techchallenge.api.application.gateways.PedidoGateway;
import food.techchallenge.api.application.pedidousecases.PedidoInteractor;
import food.techchallenge.api.infrastructure.gateways.PedidoRepositoryGateway;
import food.techchallenge.api.infrastructure.persistence.ClienteRepository;
import food.techchallenge.api.infrastructure.persistence.PedidoPagamentoRepository;
import food.techchallenge.api.infrastructure.persistence.PedidoProdutoRepository;
import food.techchallenge.api.infrastructure.persistence.PedidoRepository;
import food.techchallenge.api.infrastructure.persistence.ProdutoRepository;

@Configuration
public class PedidoConfig {
    
    @Bean
    PedidoInteractor createPedidoCase(PedidoGateway pedidoGateway){
       
        return new PedidoInteractor(pedidoGateway);
    
    }
    
    @Bean
    PedidoGateway pedidoGateway(PedidoRepository pedidoRepository,
                                  ProdutoRepository produtoRepository,
                                  ClienteRepository clienteRepository,
                                  PedidoProdutoRepository produtoPedidoRepository,
                                  PedidoPagamentoRepository pedidoPagamentoRepository){
       
        return new PedidoRepositoryGateway(pedidoRepository,produtoRepository,clienteRepository,produtoPedidoRepository, pedidoPagamentoRepository);
    
    }

    
}