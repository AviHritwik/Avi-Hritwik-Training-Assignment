package cap.q7.orderService

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderService {
	
	@Autowired
	DataRepo dao;
	
	public void placeOrder(Orders orders) {
		dao.save(orders);
	}
	public void updateOrder(String id,Orders order) {
		dao.save(order);
	}
	public Optional<Orders> viewOrder(String id) {
		return dao.findById(id);
	}
	
	public List<Orders> viewOrders() {
		return dao.findAll();
	}
	public void deleteOrder(String id) {
		dao.deleteById(id);
	}
}