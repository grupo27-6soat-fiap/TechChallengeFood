package food.techchallenge.api.domain.produto.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import food.techchallenge.api.domain.produto.entity.Produto;

@Repository
public interface IProdutoRepository extends JpaRepository<Produto, Long> {

}
