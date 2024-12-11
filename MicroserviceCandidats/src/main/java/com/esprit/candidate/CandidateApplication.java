package com.esprit.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidateApplication.class, args);
    }
@Autowired
    private CandidatRepository repository;

    @Bean
    ApplicationRunner init(){
        return (args)-> {
            //Save
            repository.save(new Candidat("Aziz","Is","Aziz@esprit.tn"));
            repository.save(new Candidat("Ahmed","Is","Ahmed@esprit.tn"));
            repository.save(new Candidat("Hamza","Is","Hamza@esprit.tn"));
            //fetch
            repository.findAll().forEach(System.out::println);
        };
    }
}
