package food.techchallenge.api.infrastructure.persistence;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoPagamentoRepository extends JpaRepository<PedidoPagamentoEntity, Long> {

    Optional<PedidoPagamentoEntity> findByIdSistemaExterno(Long idSistemaExterno);

}
