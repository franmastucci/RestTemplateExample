package com.example.response.model.dto.request;

import com.example.response.enums.Persona;

import lombok.Data;

@Data
public class CVURequest {
	
	private Long pspId;
	
	private Long ctaId;
	
	private String cvu;
	
	private String tipo;
	
	private String cuit;
	 
	private String titular;
	
	private String moneda;
	
	private Persona personaTipo;

}
