package food.techchallenge.api.domain.cliente.interfaces.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.techchallenge.api.domain.cliente.entity.Cliente;
@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByCpf(String cpf);
}
