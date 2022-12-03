package com.example.response.model.dto.response;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class CVUResponse {
	
	private String status; 
	
	private String message;
	
	private String cvu;
	
	private String token;

}
