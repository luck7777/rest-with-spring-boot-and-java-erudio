package com.lucascaraujo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucascaraujo.model.Person;

public interface PersonRepository  extends JpaRepository<Person, Long>{}
