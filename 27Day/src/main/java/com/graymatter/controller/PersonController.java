package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.entities.Person;
import com.graymatter.services.PersonService;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    // Endpoint to get all persons
    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return service.getAllPersons();
    }

    // Endpoint to get persons by name
    @GetMapping("/persons/{name}")
    public List<Person> getAllPersonsByName(@PathVariable("name") String name) {
        return service.getAllPersonsByName(name);
    }

    // Endpoint to add a new person
    @PostMapping("/persons")
    public Person addPerson(@RequestBody Person person) {
        return service.addPerson(person);
    }
}
