package food.techchallenge.api.domain.pedido.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.techchallenge.api.infraestrutura.entity.ProdutoPedidoEntity;

@Repository
public interface IProdutoPedidoRepository extends JpaRepository<ProdutoPedidoEntity, Long> {

}
