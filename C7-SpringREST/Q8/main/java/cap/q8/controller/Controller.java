package cap.q8.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public void addProd(@RequestBody Products product) {
		service.placeProduct(product);
	}
	
	@RequestMapping(value="/updateProduct/{productId}",method=RequestMethod.PUT)
	public void updateProd(@PathVariable String productId, @RequestBody Products product) {
		service.updateProduct(id, product);
	}
	@RequestMapping(value="/find/{productId}",method=RequestMethod.GET)
	public Optional<Products> viewProd(@PathVariable String productId) {
		return service.viewProduct(id);
	}
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Products> viewProds() {
		return service.viewProducts();
	}
	
	@RequestMapping(value="/delete/{productId}",method=RequestMethod.DELETE)
	public void deleteOrder(@PathVariable String productId) {
		service.deleteProducts(id);
	}
}
