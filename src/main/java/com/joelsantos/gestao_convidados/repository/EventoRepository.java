package com.joelsantos.gestao_convidados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joelsantos.gestao_convidados.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
    // This interface will automatically provide CRUD operations for Evento entities
}
