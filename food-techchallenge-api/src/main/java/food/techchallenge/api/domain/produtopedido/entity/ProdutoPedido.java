package food.techchallenge.api.domain.produtopedido.entity;

import food.techchallenge.api.domain.produto.entity.Produto;

public class ProdutoPedido {

    public ProdutoPedido(Produto produto, int quantidade, Double valorProduto){
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorProduto = valorProduto;

    }

    private Produto produto;
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    private int quantidade;
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    private Double valorProduto;
    public Double getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    } 
}
