package food.techchallenge.api.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import food.techchallenge.api.application.gateways.ProdutoGateway;
import food.techchallenge.api.application.produtousecases.ProdutoInteractor;
import food.techchallenge.api.infrastructure.controlers.produto.ProdutoDTOMapper;
import food.techchallenge.api.infrastructure.gateways.ProdutoEntityMapper;
import food.techchallenge.api.infrastructure.gateways.ProdutoRepositoryGateway;
import food.techchallenge.api.infrastructure.persistence.ProdutoRepository;

@Configuration
public class ProdutoConfig {

    @Bean
    ProdutoInteractor createProdutoCase(ProdutoGateway produtoGateway){
        return new ProdutoInteractor(produtoGateway);
    }
    
    @Bean
    ProdutoGateway produtoGateway(ProdutoRepository produtoRepository, ProdutoEntityMapper produtoEntityMapper){
        return new ProdutoRepositoryGateway(produtoRepository,produtoEntityMapper);
    }

    @Bean
    ProdutoEntityMapper produtoEntityMapper(){
        return new ProdutoEntityMapper();
    }

    @Bean
    ProdutoDTOMapper produtoDTOMapper(){
        return new ProdutoDTOMapper();
    }
}
