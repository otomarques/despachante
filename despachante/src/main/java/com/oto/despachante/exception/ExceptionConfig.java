package com.oto.despachante.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionConfig {
	@ExceptionHandler({
		EmptyResultDataAccessException.class
	})
	public ResponseEntity errorNotFound() {
		return ResponseEntity.notFound().build();
	}
	public ResponseEntity accessDenied() {
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new Error("Acesso Negado"));
	}
}

class Error{
	public String error;
	public Error(String error) {
		this.error = error;
	}
}