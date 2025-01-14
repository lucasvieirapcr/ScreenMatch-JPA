package com.springsemweb.screenmatch;

import com.springsemweb.screenmatch.principal.Principal;
import com.springsemweb.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

    @Autowired
    private SerieRepository repositorio;


    public static void main(String[] args) {
        SpringApplication.run(ScreenMatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Principal principal = new Principal(repositorio);
        principal.exibeMenu();

    }
}
