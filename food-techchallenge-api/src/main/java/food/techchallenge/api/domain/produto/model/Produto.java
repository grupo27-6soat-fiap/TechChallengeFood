package food.techchallenge.api.domain.produto.model;


public class Produto { 
	
	private Long id;
	private String nome;
	private String categoria;
	private String descricao;
	private Double preco;
	private String imagem;
	
	public Produto(Long id, String nome, String categoria, String descricao, Double preco, String imagem){
        this.id = id;
        this.nome = nome;
		this.categoria = categoria;
        this.descricao = descricao;
		this.preco = preco;
		this.imagem = imagem;
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

}
