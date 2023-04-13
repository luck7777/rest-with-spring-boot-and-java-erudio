package com.lucascaraujo.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucascaraujo.exceptions.ResourceNotFoundException;
import com.lucascaraujo.model.Person;
import com.lucascaraujo.repositories.PersonRepository;

@Service
public class PersonServices {	
	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	public Person findById (Long id) {
		
		logger.info("Finding one person!");
		
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found this ID!"));
	}
	
	public List<Person> findAll () {
		
		logger.info("Finding all peaple!");
		
		return repository.findAll();
	}
	
	public Person create(Person person) {
		
		logger.info("Create one person!");
		
		return repository.save(person);
	}
	
	public Person update(Person person) {
		
		logger.info("Update one person!");
		
		Person entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found this ID!"));
		
		entity.setNome(person.getNome());
		entity.setSobrenome(person.getSobrenome());
		entity.setEndereco(person.getEndereco());
		entity.setGenero(person.getGenero());
		
		return repository.save(person);
	}
	
	public void delete(Long id) {
		
		logger.info("Deleting one person!");
		
		Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found this ID!"));
		
		repository.delete(entity);
	}
}
