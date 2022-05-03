package com.algaworks.msr.algalogapi.domain.repository;

import java.util.List;
import java.util.Optional;

//Imports:
import com.algaworks.msr.algalogapi.domain.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    //Methods:
    List<Cliente> findByName(String name);
    List<Cliente> findByNameContaining(String name);
    Optional<Cliente> findByEmail(String email);
}
