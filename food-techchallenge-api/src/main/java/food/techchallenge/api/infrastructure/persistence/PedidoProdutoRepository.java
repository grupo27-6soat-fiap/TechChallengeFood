package food.techchallenge.api.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoProdutoRepository extends JpaRepository<ProdutoPedidoEntity, Long> {

}