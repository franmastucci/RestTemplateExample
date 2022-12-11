package com.example.response.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.response.enums.Persona;
import com.example.response.model.dto.request.CVURequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class CVUControllerTest {
	
    @Autowired
    public MockMvc mockMvc;
    
    @Autowired
    protected ObjectMapper objectMapper;
	
    private static final String CREATE_CVU = "/response/cvu";

    @Test
    public void should_return_200ok_whit_a_valid_cvu_request() throws Exception {
        mockMvc.perform(post(CREATE_CVU)
        				.header(HttpHeaders.AUTHORIZATION, "Bearer token from test Header")
                        .content(this.buildRequest())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful());
    }

	private String buildRequest() throws JsonProcessingException {
		String request = objectMapper.writeValueAsString(CVURequest.builder()
    			.pspId(987654321L)
    			.ctaId(12345678L)
    			.cvu("1111111")
    			.tipo("Cuenta Virtual Unificada")
    			.cuit("2022333449")
    			.titular("Juan Perez")
    			.moneda("ARS")
    			.personaTipo(Persona.F)
    			.build());
		return request;
	}
	
}
