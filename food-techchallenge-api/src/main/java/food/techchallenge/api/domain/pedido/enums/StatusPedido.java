package food.techchallenge.api.domain.pedido.enums;

public enum StatusPedido {
    Novo(1, "Novo"),
    Preparando(2, "Preparando"),
    Pronto(3, "Pronto"),
    Retirado(4, "Retirado");

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
