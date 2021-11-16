package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.InscriptionEntity;
import com.example.demo.repositories.InscriptionRepo;

@Service
public class InscriptionServiceImpl implements InscriptionService {
	
	private InscriptionRepo inscriptionRepo;
	
	@Autowired
	public InscriptionServiceImpl (InscriptionRepo inscriptionRepo)
	{
		super();
		this.inscriptionRepo= inscriptionRepo;
		
	}
	@Override
	public InscriptionEntity createInscriptionEntity(InscriptionEntity entity)
	{
		InscriptionEntity newEntity= inscriptionRepo.save(entity);

		return newEntity;
	}

}
