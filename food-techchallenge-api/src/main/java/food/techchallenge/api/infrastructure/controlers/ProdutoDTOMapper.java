package food.techchallenge.api.infrastructure.controlers;

import food.techchallenge.api.domain.produto.entity.Produto;

public class ProdutoDTOMapper {
  
    CreateProdutoResponse toResponse(Produto produto){
        return new CreateProdutoResponse(produto.getId(),produto.getNome(),produto.getCategoria(),produto.getDescricao(),produto.getPreco());
    }

    public Produto toProduto(CreateProdutoRequest request){
        return new Produto(request.id(),request.nome(), request.categoria(), request.descricao(), request.preco(), request.imagem(), true);
    }

}
