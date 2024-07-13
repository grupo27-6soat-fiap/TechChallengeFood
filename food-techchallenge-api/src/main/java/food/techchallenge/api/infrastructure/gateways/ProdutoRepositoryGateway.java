package food.techchallenge.api.infrastructure.gateways;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import food.techchallenge.api.application.gateways.ProdutoGateway;
import food.techchallenge.api.domain.produto.entity.Produto;
import food.techchallenge.api.infrastructure.persistence.ProdutoEntity;
import food.techchallenge.api.infrastructure.persistence.ProdutoRepository;

public class ProdutoRepositoryGateway implements ProdutoGateway {

    private final ProdutoRepository produtoRepository;
    private final ProdutoEntityMapper produtoEntityMapper;

    public ProdutoRepositoryGateway(ProdutoRepository produtoRepository, ProdutoEntityMapper produtoEntityMapper) {
        this.produtoRepository = produtoRepository;
        this.produtoEntityMapper = produtoEntityMapper;
    }

    @Override
    public Produto cadastrarProduto(Produto produto) {

        ProdutoEntity produtoEntity = produtoEntityMapper.toEntity(produto);
        
        ProdutoEntity produtoCriado = produtoRepository.save(produtoEntity);
        
        return produtoEntityMapper.toDomainObj(produtoCriado);
        
    }

    @Override
    public List<Produto> listar() {
       
        List<ProdutoEntity> produtoEntities = produtoRepository.findAll();
        List<Produto> produtos = new ArrayList<Produto>();

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

        for(int i = 0; i < produtoEntities.size(); i++) {
        
            produtos.add(produtoEntityMapper.toDomainObj(produtoEntities.get(i)));
        
        }
        
        return produtos;

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
        List<Produto> produtosCategoria = new ArrayList<Produto>();

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

        for(int i = 0; i < produtoEntities.size(); i++) {
        
            produtosCategoria.add(produtoEntityMapper.toDomainObj(produtoEntities.get(i)));
        
        }
        
        return produtosCategoria;

    }
    
}
