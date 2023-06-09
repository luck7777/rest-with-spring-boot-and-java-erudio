package com.lucascaraujo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 2449385556877868902L;
	
	public ResourceNotFoundException(String ex) {
		super(ex);
	}	
}
