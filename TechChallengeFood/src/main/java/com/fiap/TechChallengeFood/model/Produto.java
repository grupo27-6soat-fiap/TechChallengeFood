package com.fiap.TechChallengeFood.model;

import java.io.File;
 
public class Produto { 
	
	private String nome;
	private String categoria;
	private String descricao;
	private Double preco;
	private File imagem;
	private String status;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public File getImagem() {
		return imagem;
	}
	public void setImagem(File imagem) {
		this.imagem = imagem;
	}
	public void setSatus(String status) {
		this.status = status;
	}
	
}
