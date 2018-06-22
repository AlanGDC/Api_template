package com.iunigo.apitest.service;

import org.springframework.stereotype.Service;

import com.iunigo.apitest.dto.HolaRequest;
import com.iunigo.apitest.dto.HolaResponse;

@Service
public class TestService {

	public HolaResponse getHola(HolaRequest request) {
		if (request.getUser().equals("pepe") && request.getPassword().equals("12345")) {
			HolaResponse response = new HolaResponse();

			response.setCabecera("mi primer Springboot");
			response.setCuerpo("Hola " + request.getMenssage());
			response.setDespedida("espero esto funcione");

			return response;
		} else {
			throw new RuntimeException("Invalid Credentials");
		}
	}
}
