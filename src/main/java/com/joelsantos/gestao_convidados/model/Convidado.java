package com.joelsantos.gestao_convidados.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Convidado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private int quantidadeAcompanhantes;

    @ManyToOne(optional = false)
    @JoinColumn(name = "evento_id")
    private Evento evento;
}
   