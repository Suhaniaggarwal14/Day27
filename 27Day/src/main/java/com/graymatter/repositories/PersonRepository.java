package com.graymatter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>{
	@Query(name = "Person.findByName")
	public List<Person> findByName(@Param("name")String name);

	public List<Person> getAllPersonsByName(String name);

}
