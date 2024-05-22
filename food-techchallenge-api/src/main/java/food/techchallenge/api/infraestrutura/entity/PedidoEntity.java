package food.techchallenge.api.infraestrutura.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Timer;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import food.techchallenge.api.domain.pedido.model.Pedido;
import food.techchallenge.api.domain.pedido.model.ProdutoPedido;
import food.techchallenge.api.domain.pedido.model.enums.StatusPedido;
import food.techchallenge.api.domain.produto.model.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "pedido")
@Entity(name = "Pedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class PedidoEntity implements Serializable{

	public PedidoEntity(Pedido pedido){
		this.statusPedido = pedido.getStatusPedido().getCodigo();
		this.codigoFormaPagamento = pedido.getCodigoFormaPagamento();
		this.tempoDecorrido = pedido.getTempoDecorrido();
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name = "idCliente", referencedColumnName = "id")
	private ClienteEntity cliente;
	// @OneToMany(targetEntity = ProdutoPedidoEntity.class)
	// private List<ProdutoPedidoEntity> produtos;
	private Double valorTotal;
	private int statusPedido;
	private int codigoFormaPagamento;
	private int tempoDecorrido;
	
}
