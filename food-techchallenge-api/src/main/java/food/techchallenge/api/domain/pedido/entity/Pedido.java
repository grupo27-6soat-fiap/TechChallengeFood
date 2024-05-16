package food.techchallenge.api.domain.pedido.entity;

import java.io.Serializable;
import java.util.Timer;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pedido")
@Entity(name = "Pedido")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pedido implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//private Cliente cliente;
	//private List<Produto> produtos;
	private Double valorTotal;
	private String status;
	private int codigoFormaPagamento;
	@JdbcTypeCode(SqlTypes.JSON)
	private Timer tempoDecorrido;
	
	
}
