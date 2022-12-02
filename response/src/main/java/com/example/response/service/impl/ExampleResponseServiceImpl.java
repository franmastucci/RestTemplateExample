package com.example.response.service.impl;

import org.springframework.stereotype.Service;

import com.example.response.service.ExampleResponseService;

@Service
public class ExampleResponseServiceImpl implements ExampleResponseService{

	public String getResponse() {
		return "Respondiendo desde Response Api (port: 8081)";
	}

}
