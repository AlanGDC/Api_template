package com.iunigo.apitest.service;

import org.springframework.stereotype.Service;

import com.iunigo.apitest.dto.HolaRequest;
import com.iunigo.apitest.dto.HolaResponse;
import com.iunigo.apitest.exceptions.InvalidCredentialsException;

@Service
public class TestService {

	public HolaResponse getHola(HolaRequest request) throws InvalidCredentialsException {
		if (request.getUser().equals("pepe") && request.getPassword().equals("12345")) {
			HolaResponse response = new HolaResponse();

			response.setCabecera("mi primer Springboot");
			response.setCuerpo("Hola " + request.getMenssage());
			response.setDespedida("espero esto funcione");

			return response;
		} else {
			throw new InvalidCredentialsException("Invalid Credentials");
		}
	}
}
