package food.techchallenge.api.application.gateways;

import java.util.List;

import food.techchallenge.api.domain.produto.entity.Produto;

/**
 * ProdutoGateway
 */
public interface ProdutoGateway {

    Produto cadastrarProduto(Produto produto);
    
    List<Produto> listar();

    void excluir(Long id);

    List<Produto> listarPorCategoria(String categoria);
    
}