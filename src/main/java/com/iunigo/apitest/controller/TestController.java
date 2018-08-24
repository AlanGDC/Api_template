package com.iunigo.apitest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iunigo.apitest.dto.HolaRequest;
import com.iunigo.apitest.dto.HolaResponse;
import com.iunigo.apitest.exceptions.InvalidCredentialsException;
import com.iunigo.apitest.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@PostMapping("/test")
	public ResponseEntity<?> helloWord(@RequestBody HolaRequest request) throws InvalidCredentialsException{
		
		return new ResponseEntity<HolaResponse>(testService.getHola(request), HttpStatus.OK) ;
	}
	
}
