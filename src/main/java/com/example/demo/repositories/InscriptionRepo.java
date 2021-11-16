package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.InscriptionEntity;

public interface InscriptionRepo extends JpaRepository<InscriptionEntity, Integer> {

}
