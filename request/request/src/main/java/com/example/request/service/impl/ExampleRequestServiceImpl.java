package com.example.request.service.impl;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.request.service.ExampleRequestService;

@Service
public class ExampleRequestServiceImpl implements ExampleRequestService {
	
	private String apiResponseUri = "http://localhost:8081/response/message";
	
	private RestTemplate restTemplate = new RestTemplate();

	
	public String getMessageFromResponseApi()  {
		HttpEntity<String> response = restTemplate.getForEntity(apiResponseUri, String.class);	
		return response.getBody();
	}
	 
}
