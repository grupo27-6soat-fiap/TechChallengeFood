package food.techchallenge.api.infraestrutura.entity;

import food.techchallenge.api.domain.cliente.model.Cliente;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cliente")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ClienteEntity {

    public ClienteEntity(Cliente cliente){
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.nome = cliente.getNome();
    }
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;

    public Cliente toCliente() {
        return new Cliente(this.id, this.cpf, this.email, this.nome);
    }




}
