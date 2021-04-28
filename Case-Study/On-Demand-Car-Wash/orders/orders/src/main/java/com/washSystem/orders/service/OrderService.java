package com.washSystem.orders.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washSystem.orders.model.Order;
import com.washSystem.orders.repository.OrdersRepository;
import com.washSystem.orders.sequence.SequenceGeneratorService;

@Service
public class OrderService {
	
	@Autowired
	OrdersRepository repo;
	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;
	
	public String saveOrder(Order order) throws Exception{
		order.setOrderId(sequenceGeneratorService.generateSequence(Order.SEQUENCE_NAME));
		repo.save(order);
		return "Added order with id : " + order.getOrderId();
	}
	
	public String updateOrderStatus(long orderId,String status) {
		repo.findById(orderId).map((order) -> {
			order.setStatus(status);
			return repo.save(order);
		}).orElseThrow();
		return "Order "+orderId+" is "+status;
	}
	
	public void updateWasher(long orderId,long washerId) {
		repo.findById(orderId).map((order) -> {
			order.setWasherId(washerId);
			return repo.save(order);
		}).orElseThrow();
	}
	
	public List<Order> getOrders() {
		return repo.findAll();
	}
	
	public Optional<Order> getOrder(long orderId) throws Exception{
		Optional<Order> order = repo.findById(orderId);
		if(order.isEmpty())
			throw new Exception();
		return order;
	}
	
	 public List<Order> findByUserId(long userId) throws Exception{
		 List<Order> orderByUser = repo.findByUserId(userId);
		 if(orderByUser.isEmpty())
			 throw new Exception();
		 return orderByUser;
	}
	
	 public List<Order> findByWasherId(long washerId) throws Exception{
		 List<Order> orderByWasher =  repo.findByWasherId(washerId);
		 if(orderByWasher.isEmpty())
			 throw new Exception();
		 return orderByWasher;
	 }
	public String deleteOrder(long orderId) {
		repo.deleteById(orderId);
		return "order deleted with id : " + orderId;
	}
}
