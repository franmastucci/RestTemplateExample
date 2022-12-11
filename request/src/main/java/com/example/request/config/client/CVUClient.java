package com.example.request.config.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.request.model.dto.CVURequest;
import com.example.request.model.dto.CVUResponse;

@FeignClient(name = "cvu" , url = "http://localhost:8081")
public interface CVUClient {
	
	@RequestMapping(method = RequestMethod.POST, value = "/response/cvu")
	ResponseEntity<CVUResponse> getCVU(@RequestHeader("Authorization") String token, @RequestBody CVURequest entity);

}
