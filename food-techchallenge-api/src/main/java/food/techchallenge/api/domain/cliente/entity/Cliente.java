package food.techchallenge.api.domain.cliente.entity;

import food.techchallenge.api.domain.cliente.exception.ClienteNomeEmBrancoException;
import food.techchallenge.api.domain.cliente.vo.CPF;

public class Cliente {

    private Long id;
    private String nome;
    private String email;
    private String cpf;

    public Cliente( Long id, String nome, String email, String cpf) {
        if (nome == null || nome.trim().isEmpty()){
            throw new ClienteNomeEmBrancoException("O nome do cliente é obrigatório.");
        }
        new CPF(cpf);
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        
    }
  
    
    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
