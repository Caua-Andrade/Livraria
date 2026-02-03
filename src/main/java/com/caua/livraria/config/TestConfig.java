package com.caua.livraria.config;

import com.caua.livraria.entity.Autor;
import com.caua.livraria.repository.AutorRepository;
import com.caua.livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private AutorRepository autorRepository;

    @Override
    public void run(String... args) throws Exception {

        Autor a1 = new Autor(null, "Carlos")
    }
}
