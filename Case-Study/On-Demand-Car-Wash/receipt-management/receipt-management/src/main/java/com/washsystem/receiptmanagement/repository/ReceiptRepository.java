package com.washsystem.receiptmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.washsystem.receiptmanagement.model.Receipt;

public interface ReceiptRepository extends MongoRepository<Receipt, Long>{
	
}