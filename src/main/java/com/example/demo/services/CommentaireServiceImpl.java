package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.CommentaireEntity;
import com.example.demo.repositories.CommentaireRepo;
import com.example.demo.repositories.InscriptionRepo;

@Service
public class CommentaireServiceImpl implements CommentaireService {
	
	private CommentaireRepo commentRepo;
	
	@Autowired
	public CommentaireServiceImpl(CommentaireRepo commentRepo)
	{
		super();
		this.commentRepo= commentRepo;
	}
	
	@Override
	public CommentaireEntity createCommentaireEntity(CommentaireEntity entity)
	{
		CommentaireEntity newEntity= commentRepo.save(entity);
		return newEntity;
	}

}
