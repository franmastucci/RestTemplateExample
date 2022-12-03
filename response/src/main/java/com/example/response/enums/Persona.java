package com.example.response.enums;

public enum Persona {
	
	F("Fisica"),  J("Juridica");
	
    private final String tipo;

    Persona(String tipo) {this.tipo = tipo;}
    
    public String getTipo() {return tipo;}
	
}
