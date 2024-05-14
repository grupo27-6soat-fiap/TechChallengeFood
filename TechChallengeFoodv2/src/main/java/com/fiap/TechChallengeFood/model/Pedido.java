package com.fiap.TechChallengeFood.model;

import java.util.List;
import java.util.Timer;

public class Pedido {

	private Long id;
	private Cliente cliente;
	private List<Produto> produtos;
	private Double valorTotal;
	private String status;
	private int codigoFormaPagamento;
	private Timer tempoDecorrido;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCodigoFormaPagamento() {
		return codigoFormaPagamento;
	}
	public void setCodigoFormaPagamento(int codigoFormaPagamento) {
		this.codigoFormaPagamento = codigoFormaPagamento;
	}
	public Timer getTempoDecorrido() {
		return tempoDecorrido;
	}
	public void setTempoDecorrido(Timer tempoDecorrido) {
		this.tempoDecorrido = tempoDecorrido;
	}
	
}
