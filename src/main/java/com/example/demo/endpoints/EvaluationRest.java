package com.example.demo.endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.EvaluationEntity;
import com.example.demo.services.EvaluationService;

@RestController
@RequestMapping("/api/evaluation")
public class EvaluationRest {
	
	private EvaluationService service;
	
	public EvaluationRest(EvaluationService service)
	{
		super();
		this.service=service;
	}
	
	@PostMapping
	public EvaluationEntity createAvaluationEntity(@RequestBody EvaluationEntity entity)
	{
		return service.createEvaluationEntity(entity);
	}
	

}
