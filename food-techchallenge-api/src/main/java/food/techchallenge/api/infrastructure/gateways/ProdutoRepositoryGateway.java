package food.techchallenge.api.infrastructure.gateways;

import java.util.List;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public void excluir(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public List<Produto> listarPorCategoria(String categoria) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarPorCategoria'");
    }
    
}
