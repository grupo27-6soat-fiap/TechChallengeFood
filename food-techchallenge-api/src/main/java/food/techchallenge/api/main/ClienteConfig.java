package food.techchallenge.api.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import food.techchallenge.api.application.clienteusecases.ClienteInteractor;
import food.techchallenge.api.application.gateways.ClienteGateway;
import food.techchallenge.api.infrastructure.gateways.ClienteRepositoryGateway;
import food.techchallenge.api.infrastructure.persistence.ClienteRepository;

@Configuration
public class ClienteConfig {

    @Bean
    ClienteInteractor createClienteCase(ClienteGateway clienteGateway){
        return new ClienteInteractor(clienteGateway);
    }
    
    @Bean
    ClienteGateway clienteGateway(ClienteRepository clienteRepository){
        return new ClienteRepositoryGateway(clienteRepository);
    }

}
