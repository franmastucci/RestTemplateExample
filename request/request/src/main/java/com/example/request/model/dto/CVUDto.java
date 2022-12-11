package com.example.request.model.dto;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class CVUDto {
	
	private String status; 
	
	private String message;
	
	private String cvu;
	
	private String token;

}
