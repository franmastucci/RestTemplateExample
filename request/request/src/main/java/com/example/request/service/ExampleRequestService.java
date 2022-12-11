package com.example.request.service;

import org.springframework.http.ResponseEntity;

import com.example.request.model.dto.CVURequest;
import com.example.request.model.dto.CVUResponse;

public interface ExampleRequestService {
	public ResponseEntity<CVUResponse> saveFromResponseApi(String token, CVURequest request);
}
