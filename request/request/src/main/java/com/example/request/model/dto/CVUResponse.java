package com.example.request.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data @Builder @RequiredArgsConstructor @AllArgsConstructor 
public class CVUResponse {
	
	private String status; 
	
	private String message;
	
	private String cvu;
	
	private String token;

}
