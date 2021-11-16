package com.example.demo.endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CommentaireEntity;
import com.example.demo.services.CommentaireService;

@RestController
@RequestMapping("/api/commentaire")
public class CommentaireRest {
	
	private CommentaireService service;
	
	public CommentaireRest(CommentaireService commentService)
	{
		super();
		this.service=commentService;
	}
	
	@PostMapping
	public CommentaireEntity createCommentaireEnity(@RequestBody CommentaireEntity entity)
	{
		return service.createCommentaireEntity(entity);
	}

}
