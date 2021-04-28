package com.washsystem.washservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.washsystem.washservices.model.AddOn;

public interface AddOnRepository extends MongoRepository<AddOn, String>{

}
