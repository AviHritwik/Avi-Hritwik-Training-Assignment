package cap.q8.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	DataRepo dao;
	
	public void placeProduct(Products orders) {
		dao.save(orders);
	}
	public void updateProduct(String id,Products order) {
		dao.save(order);
	}
	public Optional<Products> viewProduct(String id) {
		return dao.findById(id);
	}
	
	public List<Products> viewProducts() {
		return dao.findAll();
	}
	public void deleteProducts(String id) {
		dao.deleteById(id);
	}
}