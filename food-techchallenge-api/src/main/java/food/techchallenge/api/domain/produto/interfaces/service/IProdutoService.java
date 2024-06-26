package food.techchallenge.api.domain.produto.interfaces.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import food.techchallenge.api.domain.produto.model.Produto;

public interface IProdutoService {

    @Autowired
    void cadastrarProduto(Produto produto);

    List<Produto> listar();

    void excluir(Long id);

    List<Produto> listarPorCategoria(String categoria);
    
}