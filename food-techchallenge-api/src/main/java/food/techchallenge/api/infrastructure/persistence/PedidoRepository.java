package food.techchallenge.api.infrastructure.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import food.techchallenge.api.domain.pedido.entity.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<PedidoEntity, Long>  {

    // void atualizarPedido(Pedido pedido);

    @Query(value = "SELECT * FROM vw_pedidos", nativeQuery = true)
    List<Pedido> listarPedidos();

    // Pedido obterPedido(Pedido pedido);


}
