package com.example.request.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.service.ExampleRequestService;


@RestController
@RequestMapping("/request")
public class ExampleRequestController {
	
	@Autowired
	private ExampleRequestService exampleRequestService;
	

	@RequestMapping("/message")
	public String getMessageFromResponseApi() {
		return exampleRequestService.getMessageFromResponseApi();
	}
	
}
