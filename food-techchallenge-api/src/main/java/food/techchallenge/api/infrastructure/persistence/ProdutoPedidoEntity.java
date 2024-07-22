package food.techchallenge.api.infrastructure.persistence;

import java.util.Optional;

import food.techchallenge.api.domain.produtopedido.entity.ProdutoPedido;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "produtoPedido")
@Entity(name = "ProdutoPedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ProdutoPedidoEntity {

    public ProdutoPedidoEntity(ProdutoPedido produtoPedido, PedidoEntity pedido, Optional<ProdutoEntity> produto){
        this.quantidade = produtoPedido.getQuantidade();
        this.valorProduto = produtoPedido.getValorProduto();
        this.pedido = pedido;
        this.produto = produto.get();

    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @ManyToOne
    @JoinColumn(name = "idProduto", referencedColumnName = "id")
    private ProdutoEntity produto;
    @OneToOne
    @JoinColumn(name = "idPedido", referencedColumnName = "id")
    private PedidoEntity pedido;
    private int quantidade;
    private Double valorProduto;

}
