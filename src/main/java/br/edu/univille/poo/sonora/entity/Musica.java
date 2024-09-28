package br.edu.univille.poo.sonora.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Musica {

    @Id
    @GeneratedValue
    private long id;

    private String titulo;
    private String autor;
    private String genero;
    private double duracao;
}
