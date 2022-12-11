package com.example.request.model.dto;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class CVURequest {
	
	private Long pspId;
	
	private Long ctaId;
	
	private String cvu;
	
	private String tipo;
	
	private String cuit;
	 
	private String titular;
	
	private String moneda;
	
	private String personaTipo;
	
}
