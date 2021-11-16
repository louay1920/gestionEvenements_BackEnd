package com.example.demo.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventEntity {

	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
	    private String nom;
	    private String type;
	    private String ville;
	    private LocalDate date;
	    @OneToMany(mappedBy = "evenement", cascade = CascadeType.REMOVE)
	    private List<InscriptionEntity> inscriptions;
	    
	    @OneToMany(mappedBy = "evenement", cascade = CascadeType.REMOVE)
	    private List<CommentaireEntity> commentaires;
	    
	    @OneToMany(mappedBy = "evenement", cascade = CascadeType.REMOVE)
	    private List<EvaluationEntity> evaluations;
	    
	    @OneToMany(mappedBy = "evenement", cascade = CascadeType.REMOVE)
	    private List<PaymentEntity> payments;

}
