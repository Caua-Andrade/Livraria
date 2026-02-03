package com.caua.livraria.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tb_livro")
public class Livro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // cria os ids em ordem (1, 2, 3...)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
}
