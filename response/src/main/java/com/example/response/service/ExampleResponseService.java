package com.example.response.service;

import com.example.response.model.dto.request.CVURequest;
import com.example.response.model.dto.response.CVUResponse;

public interface ExampleResponseService {
	
	public CVUResponse saveCVU(CVURequest request, String token);
	
}
