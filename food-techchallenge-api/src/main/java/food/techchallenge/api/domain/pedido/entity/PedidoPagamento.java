package food.techchallenge.api.domain.pedido.entity;


import food.techchallenge.api.domain.pedido.enums.StatusPagamento;

public class PedidoPagamento {

    public PedidoPagamento(Long idPedido, Long idSistemaExterno, int statusPagamento, String dataInclusao){
        this.idSistemaExterno = idSistemaExterno;
        this.statusPagamento = StatusPagamento.values()[statusPagamento -1];
        this.dataInclusao = dataInclusao;
        this.idPedido = idPedido;

    }

    public PedidoPagamento(){

    }

    private Long idPedido;
    public Long getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    private Long idSistemaExterno;
    public Long getIdSistemaExterno() {
        return idSistemaExterno;
    }
    public void setIdSistemaExterno(Long idSistemaExterno) {
        this.idSistemaExterno = idSistemaExterno;
    }

    private StatusPagamento statusPagamento;
    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }
    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    private String  dataInclusao;
    public String  getDataInclusao() {
        return dataInclusao;
    }
    public void setDataInclusao(String dataInclusao) {
        this.dataInclusao = dataInclusao;
    }


}
