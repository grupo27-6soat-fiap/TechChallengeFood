package food.techchallenge.api.domain.produto.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import food.techchallenge.api.domain.pedido.model.enums.StatusPedido;
import food.techchallenge.api.domain.produto.interfaces.repository.IProdutoRepository;
import food.techchallenge.api.domain.produto.interfaces.service.IProdutoService;
import food.techchallenge.api.domain.produto.model.Produto;
import food.techchallenge.api.infraestrutura.entity.PedidoEntity;
import food.techchallenge.api.infraestrutura.entity.ProdutoEntity;
import jakarta.persistence.criteria.CriteriaBuilder;

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

        for(int i = 0; i < produtoEntities.size(); i++) {
           
            if (produtoEntities.get(i).getIsAtivo() == false){
               
                produtoEntities.remove(i);
               
               if (i == 0){
                    i = 0;
               } else {
                    i--;
               }

           } 
        }

        return produtoEntities.stream()
                       .map(ProdutoEntity::toProduto)
                       .collect(Collectors.toList());
        
	}

    @Override
    public void excluir(Long id) {

        Optional<ProdutoEntity> produtoOpt = produtoRepository.findById(id);
        if(produtoOpt.isPresent()){
            ProdutoEntity produtoEntity = produtoOpt.get();
            produtoEntity.setIsAtivo(false);
            produtoRepository.save(produtoEntity);
        }
    }

    @Override
    public List<Produto> listarPorCategoria(String categoria) {
        
        List<ProdutoEntity> produtoEntities = this.produtoRepository.findByCategoria(categoria);

        for(int i = 0; i < produtoEntities.size(); i++) {
           
            if (produtoEntities.get(i).getIsAtivo() == false){
               
                produtoEntities.remove(i);
               
               if (i == 0){
                    i = 0;
               } else {
                    i--;
               }

           } 
        }

        return produtoEntities.stream()
                       .map(ProdutoEntity::toProduto)
                       .collect(Collectors.toList());

    }

}
