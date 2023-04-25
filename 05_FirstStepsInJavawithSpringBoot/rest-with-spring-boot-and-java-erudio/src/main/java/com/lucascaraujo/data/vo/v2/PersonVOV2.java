package com.lucascaraujo.data.vo.v2;

import java.io.Serializable;
import java.util.Date;

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
public class PersonVOV2 implements Serializable{

	private static final long serialVersionUID = -2737255471879853069L;
	
	private Long id;	
	private String nome;	
	private String sobrenome;	
	private String endereco;	
	private String genero;
	private Date dtNascimento;
	

}
