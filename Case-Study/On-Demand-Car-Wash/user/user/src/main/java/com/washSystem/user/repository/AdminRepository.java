package com.washSystem.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.washSystem.user.model.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, Long>{

}
