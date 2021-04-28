package com.washsystem.washservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.washsystem.washservices.model.WashServices;

public interface WashServicesRepository extends MongoRepository<WashServices, String>{

}
