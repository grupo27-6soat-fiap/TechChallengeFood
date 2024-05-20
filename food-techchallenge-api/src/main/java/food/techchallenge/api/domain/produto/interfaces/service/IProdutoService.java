package food.techchallenge.api.domain.produto.interfaces.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import food.techchallenge.api.domain.cliente.model.Produto;

public interface IProdutoService {

    @Autowired
    void cadastrarProduto(Produto produto);

    List<Produto> listar();

}