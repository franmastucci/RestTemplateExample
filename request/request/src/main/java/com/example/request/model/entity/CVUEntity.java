package com.example.request.model.entity;

import com.example.request.enums.Persona;

import lombok.Data;

@Data
public class CVUEntity {

	private Long pspId;
	
	private Long ctaId;
	
	private String cvu;
	
	private String tipo;
	
	private String cuit;
	 
	private String titular;
	
	private String moneda;
	
	private Persona personaTipo;
	
}
