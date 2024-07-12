package food.techchallenge.api.application.produtousecases;

import java.util.List;

import food.techchallenge.api.application.gateways.ProdutoGateway;
import food.techchallenge.api.domain.produto.entity.Produto;

public class ProdutoInteractor {

    private ProdutoGateway produtoGateway;

    public ProdutoInteractor(ProdutoGateway produtoGateway) {
        this.produtoGateway = produtoGateway;
    }

    public Produto cadastrarProduto(Produto produto){
        return produtoGateway.cadastrarProduto(produto);
    }

    public List<Produto> listar(){
        return produtoGateway.listar();
    }

    public void excluir(Long id){
        produtoGateway.excluir(id);
    }

    public List<Produto> listarPorCategoria(String categoria){
        return produtoGateway.listarPorCategoria(categoria);
    }
    
}