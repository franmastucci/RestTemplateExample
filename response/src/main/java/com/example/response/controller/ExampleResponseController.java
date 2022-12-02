package com.example.response.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.service.ExampleResponseService;

@RestController()
@RequestMapping("/response")
public class ExampleResponseController {
	
	@Autowired
	private ExampleResponseService exampleResponseService;
	
	@RequestMapping("/message")
	public String getMessage(){
		return exampleResponseService.getResponse();
	}
	
}
