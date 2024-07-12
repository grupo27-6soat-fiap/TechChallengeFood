package food.techchallenge.api.infrastructure.persistence;

import food.techchallenge.api.domain.produto.entity.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "produto")
@Entity(name = "Produto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProdutoEntity { 
	
	public ProdutoEntity(String nome, String categoria, String descricao, Double preco, String imagem, boolean isAtivo){
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
		this.preco = preco;
		this.imagem = imagem;
		this.isAtivo = true;
    }
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String categoria;
	private String descricao;
	private Double preco;
	private String imagem;
	private Boolean isAtivo;
	
	 //public Produto toProduto() {
	 //       return new Produto(this.id, this.nome, this.categoria, this.descricao, this.preco, this.imagem, this.isAtivo);
	 //}
	
}
