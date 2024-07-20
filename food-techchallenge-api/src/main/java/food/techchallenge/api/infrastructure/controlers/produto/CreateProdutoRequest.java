package food.techchallenge.api.infrastructure.controlers.produto;

    public record CreateProdutoRequest(String nome, String categoria, String descricao, Double preco, String imagem) { 

}
