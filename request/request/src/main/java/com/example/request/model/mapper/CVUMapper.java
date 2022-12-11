package com.example.request.model.mapper;

import com.example.request.model.dto.CVUDto;
import com.example.request.model.dto.CVUResponse;

public class CVUMapper {

	public CVUResponse requestToResponse(CVUDto request) {
		return CVUResponse.builder()
					.status(request.getStatus())
					.build();
	}
	
}
