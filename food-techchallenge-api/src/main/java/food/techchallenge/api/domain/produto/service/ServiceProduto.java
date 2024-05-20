package food.techchallenge.api.domain.produto.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import food.techchallenge.api.domain.cliente.interfaces.repository.IClienteRepository;
import food.techchallenge.api.domain.cliente.interfaces.service.IClienteService;
import food.techchallenge.api.domain.cliente.model.Cliente;
import food.techchallenge.api.domain.cliente.model.Produto;
import food.techchallenge.api.domain.produto.interfaces.repository.IProdutoRepository;
import food.techchallenge.api.domain.produto.interfaces.service.IProdutoService;
import food.techchallenge.api.infraestrutura.entity.ClienteEntity;
import food.techchallenge.api.infraestrutura.entity.ProdutoEntity;

@Service
public class ServiceProduto implements IProdutoService {

    private final IProdutoRepository produtoRepository;

    public ServiceProduto(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
	public void cadastrarProduto(@RequestBody Produto produto) {
        
    	produtoRepository.save(new ProdutoEntity(produto));
		
	}

	@Override
	public List<Produto> listar() {
		
		List<ProdutoEntity> produtoEntities = this.produtoRepository.findAll();
        return produtoEntities.stream()
                       .map(ProdutoEntity::toProduto)
                       .collect(Collectors.toList());
        
	}





    


}
