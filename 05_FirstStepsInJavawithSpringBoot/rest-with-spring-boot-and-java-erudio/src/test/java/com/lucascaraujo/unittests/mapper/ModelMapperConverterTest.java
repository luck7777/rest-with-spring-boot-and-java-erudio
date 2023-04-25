package com.lucascaraujo.unittests.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lucascaraujo.data.vo.v1.PersonVO;
import com.lucascaraujo.mapper.MdMapper;
import com.lucascaraujo.model.Person;
import com.lucascaraujo.unittests.mapper.mocks.MockPerson;

public class ModelMapperConverterTest {

	MockPerson inputObject;

	@BeforeEach
	public void setUp() {
		inputObject = new MockPerson();
	}

	@Test
	public void parseEntityToVOTest() {
		PersonVO output = MdMapper.parseObject(inputObject.mockEntity(), PersonVO.class);
		assertEquals(Long.valueOf(0L), output.getId());
		assertEquals("First Name Test0", output.getNome());
		assertEquals("Last Name Test0", output.getSobrenome());
		assertEquals("Addres Test0", output.getEndereco());
		assertEquals("Male", output.getGenero());
	}

	@Test
	public void parseEntityListToVOListTest() {
		List<PersonVO> outputList = MdMapper.parseListObjects(inputObject.mockEntityList(), PersonVO.class);
		PersonVO outputZero = outputList.get(0);

		assertEquals(Long.valueOf(0L), outputZero.getId());
		assertEquals("First Name Test0", outputZero.getNome());
		assertEquals("Last Name Test0", outputZero.getSobrenome());
		assertEquals("Addres Test0", outputZero.getEndereco());
		assertEquals("Male", outputZero.getGenero());

		PersonVO outputSeven = outputList.get(7);

		assertEquals(Long.valueOf(7L), outputSeven.getId());
		assertEquals("First Name Test7", outputSeven.getNome());
		assertEquals("Last Name Test7", outputSeven.getSobrenome());
		assertEquals("Addres Test7", outputSeven.getEndereco());
		assertEquals("Female", outputSeven.getGenero());

		PersonVO outputTwelve = outputList.get(12);

		assertEquals(Long.valueOf(12L), outputTwelve.getId());
		assertEquals("First Name Test12", outputTwelve.getNome());
		assertEquals("Last Name Test12", outputTwelve.getSobrenome());
		assertEquals("Addres Test12", outputTwelve.getEndereco());
		assertEquals("Male", outputTwelve.getGenero());
	}

	@Test
	public void parseVOToEntityTest() {
		Person output = MdMapper.parseObject(inputObject.mockVO(), Person.class);
		assertEquals(Long.valueOf(0L), output.getId());
		assertEquals("First Name Test0", output.getNome());
		assertEquals("Last Name Test0", output.getSobrenome());
		assertEquals("Addres Test0", output.getEndereco());
		assertEquals("Male", output.getGenero());
	}

	@Test
	public void parserVOListToEntityListTest() {
		List<Person> outputList = MdMapper.parseListObjects(inputObject.mockVOList(), Person.class);
		Person outputZero = outputList.get(0);

		assertEquals(Long.valueOf(0L), outputZero.getId());
		assertEquals("First Name Test0", outputZero.getNome());
		assertEquals("Last Name Test0", outputZero.getSobrenome());
		assertEquals("Addres Test0", outputZero.getEndereco());
		assertEquals("Male", outputZero.getGenero());

		Person outputSeven = outputList.get(7);

		assertEquals(Long.valueOf(7L), outputSeven.getId());
		assertEquals("First Name Test7", outputSeven.getNome());
		assertEquals("Last Name Test7", outputSeven.getSobrenome());
		assertEquals("Addres Test7", outputSeven.getEndereco());
		assertEquals("Female", outputSeven.getGenero());

		Person outputTwelve = outputList.get(12);

		assertEquals(Long.valueOf(12L), outputTwelve.getId());
		assertEquals("First Name Test12", outputTwelve.getNome());
		assertEquals("Last Name Test12", outputTwelve.getSobrenome());
		assertEquals("Addres Test12", outputTwelve.getEndereco());
		assertEquals("Male", outputTwelve.getGenero());
	}
}
