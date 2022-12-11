package com.example.request.service.impl;

import org.springframework.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import com.example.request.model.dto.CVURequest;
import com.example.request.model.dto.CVUResponse;
import com.example.request.service.ExampleRequestService;

@Service
public class ExampleRequestServiceImpl implements ExampleRequestService {
	
	@Value("${restTemplate.serverPath}")
	private String API_RESPONSE_SERVER_PATH;
	
	private final RestTemplate appRestClient;
	
	private HttpHeaders headers;
	  
	
    @Autowired
    public ExampleRequestServiceImpl(@Qualifier("appRestClient") RestTemplate appRestClient) {
        this.appRestClient = appRestClient;
        this.headers = new HttpHeaders();
    }
	
	public ResponseEntity<CVUResponse> saveFromResponseApi(String token, CVURequest request)  {
        return this.configureEntityResponse(token, request);
	}

	private ResponseEntity<CVUResponse> configureEntityResponse(String token, CVURequest request) throws RestClientException {
		return appRestClient.exchange(API_RESPONSE_SERVER_PATH, HttpMethod.POST, this.configureEntityRequest(request, token), CVUResponse.class);
	}

	private HttpEntity<CVURequest> configureEntityRequest(CVURequest request, String token) {
		this.configureHeaders(token);
		return new HttpEntity<CVURequest>(request, headers);
	}

	private void configureHeaders(String token) {
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.add("Authorization", token);
	}
	 
}
