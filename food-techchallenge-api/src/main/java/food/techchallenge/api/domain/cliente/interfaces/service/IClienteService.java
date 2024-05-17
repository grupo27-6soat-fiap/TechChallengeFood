package food.techchallenge.api.domain.cliente.interfaces.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import food.techchallenge.api.domain.cliente.model.Cliente;

public interface IClienteService {

    @Autowired
    void cadastrarCliente(Cliente cliente);

    List<Cliente> listar();

}
