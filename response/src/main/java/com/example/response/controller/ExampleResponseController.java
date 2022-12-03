package com.example.response.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.model.dto.request.CVURequest;
import com.example.response.model.dto.response.CVUResponse;
import com.example.response.service.ExampleResponseService;

@RestController()
@RequestMapping("/response")
public class ExampleResponseController {
	
	@Autowired
	private ExampleResponseService exampleResponseService;
	
	@PostMapping("/cvu")
	public CVUResponse createCVU(@RequestHeader(name = "Authorization") String token, @RequestBody CVURequest request){
		return exampleResponseService.saveCVU(request, token);
	}
	
}
