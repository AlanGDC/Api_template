package com.iunigo.apitest.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TestControllerAdvice {
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity invalidCredentials(final RuntimeException e ) {
		return new ResponseEntity(e.getMessage(), HttpStatus.UNAUTHORIZED);
	}
}
