package food.techchallenge.api.domain.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import food.techchallenge.api.domain.cliente.interfaces.repository.IClienteRepository;
import food.techchallenge.api.domain.cliente.interfaces.service.IClienteService;
import food.techchallenge.api.domain.cliente.model.Cliente;
import food.techchallenge.api.infraestrutura.entity.ClienteEntity;

@Service
public class ServiceCliente implements IClienteService {


  
    private final IClienteRepository clienteRepository;

    public ServiceCliente(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }



    

    @Override
    public void cadastrarCliente(@RequestBody Cliente cliente) {

        clienteRepository.save(new ClienteEntity(cliente));
        
    }


}
