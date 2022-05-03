package com.algaworks.msr.algalogapi.domain.repository;

//Importações:
import com.algaworks.msr.algalogapi.domain.model.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long>  {
    
}