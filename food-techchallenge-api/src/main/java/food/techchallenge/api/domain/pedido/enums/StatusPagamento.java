package food.techchallenge.api.domain.pedido.enums;

public enum StatusPagamento {
    AguardandoPagamento(1, "Aguardando Pagamento"),
    PagamentoAprovado(2, "Pagamento Aprovado"),
    PagamentoReprovado(3, "Pagamento Reprovado");

    private final int codigo;
    private final String descricao;

    StatusPagamento(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }

}
