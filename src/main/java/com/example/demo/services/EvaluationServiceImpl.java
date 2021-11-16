package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.EvaluationEntity;
import com.example.demo.repositories.EvaluationRepo;

@Service
public class EvaluationServiceImpl implements EvaluationService {
	
	private EvaluationRepo evalRepo;
	
	@Autowired
	public EvaluationServiceImpl(EvaluationRepo evalRepo)
	{
		super();
		this.evalRepo=evalRepo;
	}

	@Override
	public EvaluationEntity createEvaluationEntity(EvaluationEntity Entity) {
		
		EvaluationEntity newEntity = evalRepo.save(Entity);
		return newEntity;
	}

}
