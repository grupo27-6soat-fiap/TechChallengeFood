package food.techchallenge.api.domain.pedido.interfaces.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import food.techchallenge.api.domain.pedido.model.Pedido;
import food.techchallenge.api.infraestrutura.entity.PedidoEntity;


@Repository
public interface IPedidoRepository extends JpaRepository<PedidoEntity, Long>  {

    // void atualizarPedido(Pedido pedido);

    @Query(value = "SELECT * FROM vw_pedidos", nativeQuery = true)
    List<Pedido> listarPedidos();

    // Pedido obterPedido(Pedido pedido);


}
