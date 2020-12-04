package com.example.reactivespring.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;


// test warstwy repozytorium z mongodb
@DataMongoTest
// uzycie mongodb w kontenerze docker
@Testcontainers
@DisplayName("Testy reactive mongo z testcontainers (baza w docker)")
class PersonReactiveRepositoryTest {

    @Container
    // static vs instance - kontener dla wszystkich testów vs kontener per instancja
    private final GenericContainer mongo = new GenericContainer("mongo:4-bionic").withExposedPorts(27017);


    @Autowired
    private PersonReactiveRepository personReactiveRepository;

    @Test
    void givenAnEpptyDB_findAllShouldReturnOnComplete() {
        // given an empty db

        // when
        StepVerifier
                .create(personReactiveRepository.findAll())
                // then
                .verifyComplete();
    }

}