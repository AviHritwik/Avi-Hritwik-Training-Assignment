package cap.q7.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value="/placeOrder", method=RequestMethod.POST)
	public void placeOrder(@RequestBody Orders order) {
		service.placeOrder(order);
	}
	
	@RequestMapping(value="/updateOrder/{orderId}",method=RequestMethod.PUT)
	public void updateOrder(@PathVariable String orderId, @RequestBody Orders order) {
		service.updateOrder(orderId, order);
	}
	@RequestMapping(value="/search/{orderId}",method=RequestMethod.GET)
	public Optional<Orders> viewOrder(@PathVariable String orderId) {
		return service.viewOrder(orderId);
	}
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Orders> viewOrders() {
		return service.viewOrders();
	}
	
	@RequestMapping(value="/delete/{orderId}",method=RequestMethod.DELETE)
	public void deleteOrder(@PathVariable String orderId) {
		service.deleteOrder(orderId);
	}
}