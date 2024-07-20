package food.techchallenge.api.application.gateways;

import java.util.List;

import food.techchallenge.api.domain.cliente.entity.Cliente;

public interface ClienteGateway {

    void cadastrarCliente(Cliente cliente);

    List<Cliente> listar();

    Cliente consultaCliente(String cpf);

}
