package com.example.reactivespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveSpringApplication.class, args);
    }

}

/*
    Part 2 : Mongo Rest Repository + test class(cRud), real DB (testcontainers)
    TODO 1 dodajemy zaleznosci:
        mongodb-reactive
        testcontainers

    TODO 2 reactive repo

    TODO 3 JUnit5 test z testcontainers
 */

