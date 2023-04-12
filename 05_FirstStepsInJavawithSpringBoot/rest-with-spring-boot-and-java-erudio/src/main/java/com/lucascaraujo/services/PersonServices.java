package com.lucascaraujo.services;

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
}
