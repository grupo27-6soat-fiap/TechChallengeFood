package food.techchallenge.api.domain.pedido.entity;

import java.util.List;

import food.techchallenge.api.domain.cliente.entity.Cliente;
import food.techchallenge.api.domain.pedido.enums.StatusPedido;
import food.techchallenge.api.domain.produtopedido.entity.ProdutoPedido;


public class Pedido {

	public Pedido(Long id, Cliente cliente, List<ProdutoPedido> produtos, StatusPedido statusPedido, Double valorTotal, int codigoFormaPagamento, int tempoDecorrido){

		this.id = id;
		this.cliente = cliente;
		this.produtos = produtos;
		this.statusPedido = statusPedido;
		this.valorTotal = valorTotal;
		this.codigoFormaPagamento = codigoFormaPagamento;
		this.tempoDecorrido = tempoDecorrido;
	}

	private Long id;
	private Cliente cliente;
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
