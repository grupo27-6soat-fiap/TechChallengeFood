package food.techchallenge.api.domain.pedido.model;


public class ProdutoPedido {

    public ProdutoPedido(Long idProduto, int quantidade, Double valorProduto){
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.valorProduto = valorProduto;

    }

    private Long idProduto;
    public Long getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
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
