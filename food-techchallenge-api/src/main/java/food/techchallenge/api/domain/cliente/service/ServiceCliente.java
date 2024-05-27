package food.techchallenge.api.domain.cliente.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import food.techchallenge.api.domain.cliente.exception.ClienteExistenteException;
import food.techchallenge.api.domain.cliente.exception.ClienteNotFoundException;
import food.techchallenge.api.domain.cliente.interfaces.repository.IClienteRepository;
import food.techchallenge.api.domain.cliente.interfaces.service.IClienteService;
import food.techchallenge.api.domain.cliente.model.Cliente;
import food.techchallenge.api.domain.cliente.vo.CPF;
import food.techchallenge.api.infraestrutura.entity.ClienteEntity;

@Service
public class ServiceCliente implements IClienteService {
  
    private final IClienteRepository clienteRepository;

    public ServiceCliente(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    
    @Override
    public void cadastrarCliente(@RequestBody Cliente cliente) {
        // new CPF(cliente.getCpf()); 
        
        if (clienteRepository.findByCpf(cliente.getCpf()).isPresent()) {
            throw new ClienteExistenteException("Cliente com CPF " + cliente.getCpf() + " já existe");
        }else{
            clienteRepository.save(new ClienteEntity(cliente));
        }
        
    }

    @Override
    public List<Cliente> listar() {
        List<ClienteEntity> clienteEntities = this.clienteRepository.findAll();
        return clienteEntities.stream()
                       .map(ClienteEntity::toCliente)
                       .collect(Collectors.toList());
        
    }

    @Override
    public Cliente consultaCliente(String cpf) {
        new CPF(cpf);
        ClienteEntity clienteEntity = this.clienteRepository.findByCpf(cpf)
                .orElseThrow(() -> new ClienteNotFoundException("Cliente não encontrado com o  CPF " + cpf));
        return clienteEntity.toCliente();

        // Cliente cliente = this.clienteRepository.findByCpf(cpf).toCliente();
        // return cliente;
    }





    


}
