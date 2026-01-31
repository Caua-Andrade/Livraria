package com.caua.livraria.entities;

import jakarta.persistence.Entity;
import lombok.*;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

@Entity
public class Livro implements Serializable {

    private Long id;
    private String nome;
    //private Autor autor;
}
