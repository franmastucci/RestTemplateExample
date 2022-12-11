package com.example.request.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.request.config.client.CVUClient;
import com.example.request.model.dto.CVURequest;
import com.example.request.model.dto.CVUResponse;
import com.example.request.service.ExampleRequestService;

@Service
public class ExampleRequestServiceImpl implements ExampleRequestService {
	
	@Autowired
	private CVUClient cvuClient;
		
	public ResponseEntity<CVUResponse> saveFromResponseApi(String token, CVURequest request)  {
        return  cvuClient.getCVU(token, request);
	}
	 
}
