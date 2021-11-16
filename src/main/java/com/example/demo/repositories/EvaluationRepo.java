package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.EvaluationEntity;

public interface EvaluationRepo extends JpaRepository<EvaluationEntity, Integer> {

}
