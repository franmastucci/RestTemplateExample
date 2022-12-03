package com.example.response.model.mapper;

import org.springframework.stereotype.Service;

import com.example.response.enums.Persona;
import com.example.response.model.dto.request.CVURequest;
import com.example.response.model.dto.response.CVUResponse;
import com.example.response.model.entity.CVUEntity;

@Service
public class CVUMapper {
	
	public CVUEntity requestToEntity(CVURequest request)	 {
		return CVUEntity.builder()
				.cvu(request.getCvu())
				.ctaId(request.getCtaId())
				.cuit(request.getCuit())
				.pspId(request.getPspId())
				.tipo(request.getTipo())
				.titular(request.getTitular())
				.moneda(request.getMoneda())
				.personaTipo(request.getPersonaTipo())
				.build();
		
	}
	
	public CVUResponse entityToResponse(CVUEntity entity, String token) {
		return CVUResponse.builder()
				.cvu(entity.getCvu())
				.status("INICIADO")
				.message("El cvu está en estado iniciado")
				.token(token)
				.build();
	}
	
	

}
