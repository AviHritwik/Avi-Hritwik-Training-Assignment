package com.washSystem.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.washSystem.user.model.Washer;

@Repository
public interface WasherRepository extends MongoRepository<Washer, Long>{

}
