package com.lucascaraujo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException{

	private static final long serialVersionUID = 2449385556877868902L;
	
	public UnsupportedMathOperationException(String ex) {
		super(ex);
	}	
}
