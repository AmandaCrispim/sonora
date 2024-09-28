package br.edu.univille.poo.sonora.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;

    private String genero;

    private double duracao;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @Temporal(TemporalType.DATE)
    private Date dataAdicionada;

    @ManyToMany(mappedBy = "musicas")
    private List<Playlist> playlists = new ArrayList<>();

}