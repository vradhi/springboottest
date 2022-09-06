package com.springboot.springtest.controller;

import com.springboot.springtest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
    @Autowired
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/")
    public ResponseEntity<?> getPerson(){
        return ResponseEntity.ok(this.personService.getAllPerson());
    }



}
