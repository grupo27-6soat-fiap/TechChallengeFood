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
import lombok.Setter;

@Table(name = "produto")
@Entity(name = "Produto")
@Getter
@Setter
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
	
	 public Produto toProduto() {
	        return new Produto(this.id, this.nome, this.categoria, this.descricao, this.preco, this.imagem, this.isAtivo);
	 }
	
}
