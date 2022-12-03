package com.example.response.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.response.model.dto.request.CVURequest;
import com.example.response.model.dto.response.CVUResponse;
import com.example.response.model.mapper.CVUMapper;
import com.example.response.repository.CVURepository;
import com.example.response.service.ExampleResponseService;

@Service
public class ExampleResponseServiceImpl implements ExampleResponseService{
	
	@Autowired
	private  CVURepository cvuRepository;
	
	@Autowired
	private CVUMapper cvuMapper;
	
	public CVUResponse saveCVU(CVURequest request, String token) {
		return cvuMapper.entityToResponse(Optional.ofNullable(
				cvuRepository.save(cvuMapper.requestToEntity(request))).get(), token);
		
	}

}
