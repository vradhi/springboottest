package com.springboot.springtest.service;

import com.springboot.springtest.entities.Person;
import com.springboot.springtest.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    private PersonRepo personRepo;

    public List<Person> getAllPerson() {
        return this.personRepo.findAll();
    }

    public PersonService(PersonRepo personRepo){
        this.personRepo=personRepo;
    }
}
