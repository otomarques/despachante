package com.oto.despachante.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionConfig {
	@ExceptionHandler({
		EmptyResultDataAccessException.class
	})
	public ResponseEntity errorNotFound(Exception e) {
		return ResponseEntity.notFound().build();
	}
}
