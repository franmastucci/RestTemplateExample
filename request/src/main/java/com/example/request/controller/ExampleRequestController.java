package com.example.request.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.model.dto.CVURequest;
import com.example.request.model.dto.CVUResponse;
import com.example.request.service.ExampleRequestService;


@RestController
@RequestMapping("/request")
public class ExampleRequestController {
	
	@Autowired
	private ExampleRequestService exampleRequestService;
	

	@RequestMapping("/cvu")
	public ResponseEntity<CVUResponse> createCvuFromResponseApi(@RequestHeader(name = "Authorization") String token, @RequestBody CVURequest request ) {
		return exampleRequestService.saveFromResponseApi(token, request);
	}
	
}
