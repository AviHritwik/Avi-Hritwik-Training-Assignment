package cap.q9.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	CustomerService service;
	
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCust(@RequestBody Customer customer) {
		service.addCustomer(customer);
	}


	@RequestMapping(value="/getCustomer/{customerId}")
	public Optional<Customer> getCustomerByName(@PathVariable long customerId) {
		return service.getCustomerByID(customerId);
	}
	@RequestMapping(value="deleteCustomer/{customerId}", method=RequestMethod.DELETE)
	public void deleteCustById(long customerId) {
		service.deleteCustomerById(customerId);
	}
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	


	@RequestMapping(value="/update/{customerId}", method=RequestMethod.PUT)
	public void updateCustById(@PathVariable long customerId, @RequestBody Customer customer) {
		service.updateCustomerById(customerId,customer);
	}
}