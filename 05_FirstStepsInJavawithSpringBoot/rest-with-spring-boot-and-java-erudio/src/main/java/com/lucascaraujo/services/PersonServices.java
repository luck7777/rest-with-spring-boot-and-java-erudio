package com.lucascaraujo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.lucascaraujo.model.Person;

@Service
public class PersonServices {	
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public Person findById (String id) {
		
		logger.info("Finding one person!");
		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setNome("Lucas Jose");
		person.setSobrenome("Correia de Araujo");
		person.setEndereco("Rua do Zero, N° 0 - Sao Paulo - SP");
		person.setGenero("Masculino");
		
		return person;
	}
	
	public List<Person> findAll () {
		
		logger.info("Finding all peaple!");

		List<Person> persons = new ArrayList<>();
		for (int i = 1; i <= 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setNome("Nome Pessoa - " + i);
		person.setSobrenome("Sobrenome Pessoa - " + i);
		person.setEndereco("Endereço - " + i);
		person.setGenero("Genero - " + i);
		
		return person;
	}
	
	public Person create(Person person) {
		
		logger.info("Create one person!");
		
		return person;
	}
	
	public Person update(Person person) {
		
		logger.info("Update one person!");
		
		return person;
	}
	
	public void delete(String id) {
		
		logger.info("Deleting one person!");
	}
}
