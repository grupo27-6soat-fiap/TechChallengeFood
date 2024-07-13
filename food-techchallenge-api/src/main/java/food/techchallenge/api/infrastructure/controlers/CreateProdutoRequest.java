package food.techchallenge.api.infrastructure.controlers;

public record CreateProdutoRequest(Long id,String nome, String categoria, String descricao, Double preco, String imagem) { 

}
