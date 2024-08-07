package food.techchallenge.api.domain.pedido.enums;

public enum StatusPedido {
    Recebido(1, "Recebido"),
    EmPreparacao(2, "Em Preparação"),
    Pronto(3, "Pronto"),
    Finalizado(4, "Finalizado");

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
