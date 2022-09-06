package com.springboot.springtest.repo;

import com.springboot.springtest.entities.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class PersonRepoTest {
    @Autowired
    private PersonRepo personRepo;


    @Test
    void isPersonExistsById(){
        Person person = new Person(123, "Bhumika", "Indore");
        personRepo.save(person);
        Boolean actualResult = personRepo.isPersonExistsById(123);
        assertThat(actualResult).isTrue();
    }

    @BeforeEach
    void setup() {
        System.out.println("setting up");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearing down");
        personRepo.deleteAll();
    }





}
