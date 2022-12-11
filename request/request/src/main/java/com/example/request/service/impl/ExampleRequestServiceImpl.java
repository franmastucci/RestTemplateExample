package com.example.request.service.impl;

import org.springframework.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.request.model.dto.CVUDto;
import com.example.request.model.dto.CVURequest;
import com.example.request.model.dto.CVUResponse;
import com.example.request.service.ExampleRequestService;

@Service
public class ExampleRequestServiceImpl implements ExampleRequestService {
	
	@Value("${restTemplate.serverPath}")
	private String API_RESPONSE_SERVER_PATH;
	
	
	

	// Da un error 405 "metodo no permitido". 
	// TODO : se debería reemplazar el Método getoForEntity()
	// 		  por el famoso método "exchange()"
	
	public ResponseEntity<CVUResponse> saveFromResponseApi(String token, CVURequest request)  {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add("Authorization", token);
        HttpEntity<CVURequest> entity = new HttpEntity<CVURequest>(request, headers);
        ResponseEntity<CVUResponse> response = restTemplate.exchange("http://localhost:8081/response/cvu", HttpMethod.POST, entity, CVUResponse.class);
        System.out.println("Result - status ("+ response.getStatusCode() + ") has body: " + response.hasBody());
		
		
        return response;
	}
	 
}
