package com.joelsantos.gestao_convidados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joelsantos.gestao_convidados.model.Convidado;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {
    // Custom query methods can be defined here if needed
    
}
