package com.example.response.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.response.enums.Persona;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder @Entity(name = "CVU")
@Data @AllArgsConstructor @NoArgsConstructor
public class CVUEntity {
	
	private Long pspId;
	
	private Long ctaId;
	
	@Id @Column(nullable = false)
	private String cvu;
	
	private String tipo;
	
	private String cuit;
	 
	private String titular;
	
	private String moneda;
	
	@Enumerated(EnumType.STRING)
	private Persona personaTipo;
	
}
