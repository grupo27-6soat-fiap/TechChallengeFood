package food.techchallenge.api.domain.pedido.enums;

public enum StatusPedido {
    Recebido(1, "Recebido"),
    AguardandoPagamento(2, "Aguardando Pagamento"),
    PagamentoReprovado(3, "Pagamento Reprovado"),
    EmPreparacao(4, "Em Preparação"),
    Pronto(5, "Pronto"),
    Finalizado(6, "Finalizado");

    private final int codigo;
    private final String descricao;

    StatusPedido(int codigo, String descricao){
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
