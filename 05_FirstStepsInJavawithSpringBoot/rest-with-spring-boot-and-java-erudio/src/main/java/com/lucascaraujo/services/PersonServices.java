package com.lucascaraujo.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucascaraujo.data.vo.v1.PersonVO;
import com.lucascaraujo.data.vo.v2.PersonVOV2;
import com.lucascaraujo.exceptions.ResourceNotFoundException;
import com.lucascaraujo.mapper.MdMapper;
import com.lucascaraujo.mapper.custom.PersonMapper;
import com.lucascaraujo.model.Person;
import com.lucascaraujo.repositories.PersonRepository;

@Service
public class PersonServices {	
	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	@Autowired
	PersonMapper mapper;
	
	public PersonVO findById (Long id) {		
		logger.info("Finding one person!");		
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found this ID!"));
		return MdMapper.parseObject(entity, PersonVO.class);
	}
	
	public List<PersonVO> findAll () {		
		logger.info("Finding all peaple!");		
		return MdMapper.parseListObjects(repository.findAll(), PersonVO.class);
	}
	
	public PersonVO create(PersonVO person) {		
		logger.info("Create one person!");
		var entity = MdMapper.parseObject(person, Person.class);		
		var vo = MdMapper.parseObject(repository.save(entity), PersonVO.class);
		return vo;
	}
	
	public PersonVOV2 createV2(PersonVOV2 person) {		
		logger.info("Create one person V2!");
		var entity = mapper.convertVoToEntity(person);		
		var vo = mapper.convertEntityToVo(repository.save(entity));
		return vo;
	}
	
	public PersonVO update(PersonVO person) {		
		logger.info("Update one person!");		
		var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found this ID!"));
		
		entity.setNome(person.getNome());
		entity.setSobrenome(person.getSobrenome());
		entity.setEndereco(person.getEndereco());
		entity.setGenero(person.getGenero());
		
		var vo = MdMapper.parseObject(repository.save(entity), PersonVO.class);
		return vo;
	}
	
	public void delete(Long id) {		
		logger.info("Deleting one person!");		
		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found this ID!"));		
		repository.delete(entity);
	}
}
