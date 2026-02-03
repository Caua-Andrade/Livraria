package com.caua.livraria.config;

import com.caua.livraria.entity.Autor;
import com.caua.livraria.entity.Livro;
import com.caua.livraria.repository.AutorRepository;
import com.caua.livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public void run(String... args) throws Exception {

        Autor a1 = new Autor(null, "Carlos");
        Autor a2 = new Autor(null, "Caua");

        autorRepository.saveAll(Arrays.asList(a1, a2));

        Livro l1 = new Livro(null, "Senhor dos aneis", a1);
        Livro l2 = new Livro(null, "Clean Code", a2);

        livroRepository.saveAll(Arrays.asList(l1, l2));
    }
}
