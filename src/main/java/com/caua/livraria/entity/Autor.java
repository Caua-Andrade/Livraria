package com.caua.livraria.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Autor implements Serializable {

    private Long id;
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Autor(String nome, Long id) {
        this.nome = nome;
        this.id = id;
    }
}
