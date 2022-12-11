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

import feign.Response;

import com.example.request.config.client.CVUClient;
import com.example.request.model.dto.CVUDto;
import com.example.request.model.dto.CVURequest;
import com.example.request.model.dto.CVUResponse;
import com.example.request.service.ExampleRequestService;

@Service
public class ExampleRequestServiceImpl implements ExampleRequestService {
	
	@Autowired
	private CVUClient cvuClient;
	
	private HttpHeaders headers = new HttpHeaders();
	
	
	public ResponseEntity<CVUResponse> saveFromResponseApi(String token, CVURequest request)  {

		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add("Authorization", token);
		
        return  cvuClient.getCVU(token, request);
	}
	 
}
