package com.lucascaraujo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person implements Serializable{

	private static final long serialVersionUID = -2737255471879853069L;
	
	private Long id;
	private String nome;
	private String sobrenome;
	private String endereco;
	private String genero;

}
