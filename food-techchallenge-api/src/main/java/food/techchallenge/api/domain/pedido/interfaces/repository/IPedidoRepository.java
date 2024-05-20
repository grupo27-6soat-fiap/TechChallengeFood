package food.techchallenge.api.domain.pedido.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.techchallenge.api.domain.cliente.model.Pedido;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Long> {

}
