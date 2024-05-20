package food.techchallenge.api.domain.produto.entity;

import food.techchallenge.api.domain.produto.vo.DadosCadastroProduto;
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
public class Produto { 
	
	public Produto(DadosCadastroProduto dados){
        this.nome = dados.nome();
        this.categoria = dados.categoria();
        this.descricao = dados.descricao();
		this.preco = dados.preco();
		this.imagem = dados.imagem();
    }
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String categoria;
	private String descricao;
	private Double preco;
	private String imagem;
	
	
}
