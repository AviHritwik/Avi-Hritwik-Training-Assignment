package com.washSystem.orders.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.washSystem.orders.model.Order;

@Repository
public interface OrdersRepository extends MongoRepository<Order,Long>{

	List<Order> findByUserId(long userId);
	List<Order> findByWasherId(long washerId);
}