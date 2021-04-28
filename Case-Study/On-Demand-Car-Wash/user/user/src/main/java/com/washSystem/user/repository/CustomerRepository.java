package com.washSystem.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.washSystem.user.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Long>{
}
