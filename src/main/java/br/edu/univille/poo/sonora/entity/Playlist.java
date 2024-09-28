package br.edu.univille.poo.sonora.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Playlist {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @Temporal(TemporalType.DATE)
    private Date dataAdicionada;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
            name = "playlist_musicas",
            joinColumns = @JoinColumn(name = "playlist_id"),
            inverseJoinColumns = @JoinColumn(name = "musica_id")
    )
    private List<Musica> musicas = new ArrayList<>();

}
