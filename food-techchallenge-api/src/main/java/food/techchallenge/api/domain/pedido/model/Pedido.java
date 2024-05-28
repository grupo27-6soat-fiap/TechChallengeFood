package food.techchallenge.api.domain.pedido.model;

import java.util.List;

import food.techchallenge.api.domain.pedido.model.enums.StatusPedido;


public class Pedido {

	public Pedido(Long id, Long idCliente, List<ProdutoPedido> produtos, StatusPedido statusPedido, Double valorTotal, int codigoFormaPagamento, int tempoDecorrido){

		this.id = id;
		this.idCliente = idCliente;
		this.produtos = produtos;
		this.statusPedido = statusPedido;
		this.valorTotal = valorTotal;
		this.codigoFormaPagamento = codigoFormaPagamento;
		this.tempoDecorrido = tempoDecorrido;
	}

    private Long id;
	private Long idCliente;
	private List<ProdutoPedido> produtos;
	private StatusPedido statusPedido;
	private Double valorTotal; 
	private int codigoFormaPagamento;
	private int tempoDecorrido;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StatusPedido getStatusPedido() {
		return statusPedido;
	}
	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}
	public int getCodigoFormaPagamento() {
		return codigoFormaPagamento;
	}
	public void setCodigoFormaPagamento(int codigoFormaPagamento) {
		this.codigoFormaPagamento = codigoFormaPagamento;
	}
	public int getTempoDecorrido() {
		return tempoDecorrido;
	}
	public void setTempoDecorrido(int tempoDecorrido) {
		this.tempoDecorrido = tempoDecorrido;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public List<ProdutoPedido> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<ProdutoPedido> produtos) {
		this.produtos = produtos;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	

}
