package food.techchallenge.api.domain.produto.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import food.techchallenge.api.infraestrutura.entity.ProdutoEntity;

@Repository
public interface IProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

}
