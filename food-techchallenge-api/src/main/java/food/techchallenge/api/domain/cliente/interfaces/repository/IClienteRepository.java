package food.techchallenge.api.domain.cliente.interfaces.repository;
import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.techchallenge.api.infraestrutura.entity.ClienteEntity;

@Repository
public interface IClienteRepository extends JpaRepository<ClienteEntity, Long> {
    Optional<ClienteEntity> findById(Long id);
    ClienteEntity findByCpf(String cpf);
}
