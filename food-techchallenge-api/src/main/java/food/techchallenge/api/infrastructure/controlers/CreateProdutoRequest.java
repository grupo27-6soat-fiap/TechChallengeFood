package food.techchallenge.api.infrastructure.controlers;

public record CreateProdutoRequest(String nome, String categoria, String descricao, Double preco, String imagem) { 

}
