package food.techchallenge.api.infrastructure.persistence;

import java.util.Date;

import food.techchallenge.api.domain.pedido.entity.PedidoPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "pedidoPagamento")
@Entity(name = "PedidoPagamento")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class PedidoPagamentoEntity {

    public PedidoPagamentoEntity(PedidoEntity pedido, Long idSistemaExterno, int statusPagamento, Date dataInclusao){
        this.pedido = pedido;
        this.idSistemaExterno = idSistemaExterno;
        this.statusPagamento = statusPagamento;
        this.dataInclusao = dataInclusao;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @OneToOne
    @JoinColumn(name = "idPedido", referencedColumnName = "id")
    private PedidoEntity pedido;
    private Long idSistemaExterno;
    private int statusPagamento;
    private Date dataInclusao;

    public PedidoPagamento toPedidoPagamento(){
        return new PedidoPagamento(this.pedido.getId(),  this.idSistemaExterno, this.statusPagamento, this.dataInclusao);
    }

}
