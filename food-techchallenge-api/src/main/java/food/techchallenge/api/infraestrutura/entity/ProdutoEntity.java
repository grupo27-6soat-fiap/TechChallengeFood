package food.techchallenge.api.infraestrutura.entity;

import food.techchallenge.api.domain.produto.model.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "produto")
@Entity(name = "Produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProdutoEntity { 
	
	public ProdutoEntity(Produto dados){
        this.nome = dados.getNome();
        this.categoria = dados.getCategoria();
        this.descricao = dados.getDescricao();
		this.preco = dados.getPreco();
		this.imagem = dados.getImagem();
    }
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String categoria;
	private String descricao;
	private Double preco;
	private String imagem;
	
	 public Produto toProduto() {
	        return new Produto(this.id, this.nome, this.categoria, this.descricao, this.preco, this.imagem);
	 }
	
}
