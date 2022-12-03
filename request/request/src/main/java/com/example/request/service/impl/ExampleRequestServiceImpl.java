package com.example.request.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.request.service.ExampleRequestService;

@Service
public class ExampleRequestServiceImpl implements ExampleRequestService {
	
	@Value("${restTemplate.serverPath}")
	private String apiResponseServerPath;
	
	private RestTemplate restTemplate = new RestTemplate();

	// Da un error 405 "metodo no permitido". 
	// TODO : se debería reemplazar el Método getoForEntity()
	// 		  por el famoso método "exchange()"
	
	public String getMessageFromResponseApi()  {
		HttpEntity<String> response = restTemplate.getForEntity(apiResponseServerPath, String.class);	
		return response.getBody();
	}
	 
}
