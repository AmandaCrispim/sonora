package br.edu.univille.poo.sonora.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Autor {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
}
