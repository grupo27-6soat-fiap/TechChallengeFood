package com.fiap.TechChallengeFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.TechChallengeFood.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
