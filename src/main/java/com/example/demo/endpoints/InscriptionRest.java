package com.example.demo.endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.InscriptionEntity;
import com.example.demo.services.InscriptionService;

@RestController
@RequestMapping("/api/inscription")
public class InscriptionRest {
	
	private InscriptionService service;
	
	public InscriptionRest(InscriptionService service)
	{
		super();
		this.service=service;
	}
	
	@PostMapping
	public InscriptionEntity createInscriptionEntity(@RequestBody InscriptionEntity inscription)
	{
		return service.createInscriptionEntity(inscription);
	}

}
