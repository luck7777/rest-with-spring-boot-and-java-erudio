package com.lucascaraujo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "person")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person implements Serializable{

	private static final long serialVersionUID = -2737255471879853069L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "primeiro_nome", nullable = false, length = 60)
	private String nome;
	
	@Column(nullable = false, length = 60)
	private String sobrenome;
	
	@Column(nullable = false, length = 100)
	private String endereco;
	
	@Column(nullable = false, length = 6)
	private String genero;

}
