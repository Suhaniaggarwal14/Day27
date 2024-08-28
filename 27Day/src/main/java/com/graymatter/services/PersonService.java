package com.graymatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.entities.Person;
import com.graymatter.repositories.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    // Method to get all persons
    public List<Person> getAllPersons() {
        return repository.findAll();
    }

    // Method to get persons by name
    public List<Person> getAllPersonsByName(String name) {
        return repository.findByName(name);
    }

    // Method to add a new person
    public Person addPerson(Person person) {
        return repository.save(person);
    }

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
}
