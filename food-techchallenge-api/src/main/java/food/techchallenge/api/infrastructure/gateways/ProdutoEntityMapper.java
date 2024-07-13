package food.techchallenge.api.infrastructure.gateways;

import food.techchallenge.api.domain.produto.entity.Produto;
import food.techchallenge.api.infrastructure.persistence.ProdutoEntity;

/**
 * ProdutoEntityMapper
 */
public class ProdutoEntityMapper {

    ProdutoEntity toEntity(Produto produtoDomainObj){
        return new ProdutoEntity(produtoDomainObj.getNome(),produtoDomainObj.getCategoria(),produtoDomainObj.getDescricao(),produtoDomainObj.getPreco(), produtoDomainObj.getImagem(),produtoDomainObj.getIsAtivo());
    }

    Produto toDomainObj(ProdutoEntity produtoEntity){
        return new Produto(produtoEntity.getId(),produtoEntity.getNome(), produtoEntity.getCategoria(), produtoEntity.getDescricao(), produtoEntity.getPreco(), produtoEntity.getImagem(), produtoEntity.getIsAtivo());
    }
}