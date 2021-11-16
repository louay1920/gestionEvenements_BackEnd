package com.example.demo.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentaireEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String text;
	@ManyToOne
    private EventEntity evenement;

}
