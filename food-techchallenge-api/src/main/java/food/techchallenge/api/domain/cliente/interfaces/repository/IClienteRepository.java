package food.techchallenge.api.domain.cliente.interfaces.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.techchallenge.api.infraestrutura.entity.ClienteEntity;

@Repository
public interface IClienteRepository extends JpaRepository<ClienteEntity, Long> {
    ClienteEntity findByCpf(String cpf);
}
