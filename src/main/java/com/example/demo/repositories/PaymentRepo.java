package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.PaymentEntity;

public interface PaymentRepo extends JpaRepository<PaymentEntity, Integer> {

}
