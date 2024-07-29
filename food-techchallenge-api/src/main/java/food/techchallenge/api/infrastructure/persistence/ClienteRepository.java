package food.techchallenge.api.infrastructure.persistence;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
      
    Optional<ClienteEntity> findByCpf(String cpf);
    
}
