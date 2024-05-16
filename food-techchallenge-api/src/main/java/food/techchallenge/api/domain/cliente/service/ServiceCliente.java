package food.techchallenge.api.domain.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import food.techchallenge.api.domain.cliente.entity.Cliente;
import food.techchallenge.api.domain.cliente.interfaces.repository.IClienteRepository;
import food.techchallenge.api.domain.cliente.interfaces.service.IClienteService;
import food.techchallenge.api.domain.cliente.vo.DadosCadastroCliente;

public class ServiceCliente implements IClienteService {

    @Autowired
    private IClienteRepository _clienteRepository;

    @Override
    public void cadastrarCliente(@RequestBody DadosCadastroCliente dados) {

        _clienteRepository.save(new Cliente(dados));
        
    }

}
