package food.techchallenge.api.application.clienteusecases;

import java.util.List;

import food.techchallenge.api.application.gateways.ClienteGateway;
import food.techchallenge.api.domain.cliente.entity.Cliente;

public class ClienteInteractor {

    private ClienteGateway clienteGateway;

    public ClienteInteractor(ClienteGateway clienteGateway) {
        this.clienteGateway = clienteGateway;
    }

    public void cadastrarCliente(Cliente cliente){
        clienteGateway.cadastrarCliente(cliente);
    }

    public List<Cliente> listar(){
        return clienteGateway.listar();
    }

    public Cliente consultaCliente(String cpf){
        return clienteGateway.consultaCliente(cpf);
    }
    
}