package food.techchallenge.api.domain.produto.entity;

import food.techchallenge.api.domain.produto.exception.ProdutoDadosEmBrancoException;

public class Produto { 
	
	private Long id;
	private String nome;
	private String categoria;
	private String descricao;
	private Double preco;
	private String imagem;
	private Boolean isAtivo;

	public Produto(Long id, String nome, String categoria, String descricao, Double preco, String imagem, Boolean isAtivo){
		
		if (nome == null || nome.trim().isEmpty()){
			throw new ProdutoDadosEmBrancoException("Nome do produto obrigatório!");
		}

		if (preco == 0 || preco < 0 ){
			throw new ProdutoDadosEmBrancoException("Preço do produto inválido, o mesmo deve ser um valor real e maior que 0!");
		}

		if (categoria == null || categoria.trim().isEmpty()){
			throw new ProdutoDadosEmBrancoException("Categoria do produto obrigatória!");
		}

		if (descricao == null || descricao.trim().isEmpty()){
			throw new ProdutoDadosEmBrancoException("Descrição do produto obrigatória!");
		}

		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
        this.descricao = descricao;
		this.preco = preco;
		this.imagem = imagem;
		this.isAtivo = isAtivo;
    }
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}

	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

}
