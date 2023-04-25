package com.lucascaraujo.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.lucascaraujo.data.vo.v2.PersonVOV2;
import com.lucascaraujo.model.Person;

@Service
public class PersonMapper {
	
	public PersonVOV2 convertEntityToVo(Person person) {
		PersonVOV2 vo = new PersonVOV2();
		vo.setId(person.getId());
		vo.setEndereco(person.getEndereco());
		vo.setDtNascimento(new Date());
		vo.setNome(person.getNome());
		vo.setSobrenome(person.getSobrenome());
		vo.setGenero(person.getGenero());
		
		return vo;
	}
	
	public Person convertVoToEntity(PersonVOV2 person) {
		Person entity = new Person();
		entity.setId(person.getId());
		entity.setEndereco(person.getEndereco());
		//entity.setDtNascimento(new Date());
		entity.setNome(person.getNome());
		entity.setSobrenome(person.getSobrenome());
		entity.setGenero(person.getGenero());
		
		return entity;
	}

}
