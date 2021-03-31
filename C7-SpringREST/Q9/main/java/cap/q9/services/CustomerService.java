package cap.q9.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
		@Autowired
		private DataRepo dao;
		public void addCustomer(Customer customer) {
			dao.save(customer);
		}
		public Optional<Customer> getCustomerByID(long id) {
			return dao.findById(id);
		}
		public void deleteCustomerById(long id) {
			dao.deleteById(id);
		}
		public List<Customer> getAllCustomers(){
			List<Customer> customers= new ArrayList<>();
			dao.findAll().forEach(customers::add);
			return customers;
		}
		public void updateCustomerById(long Id, Customer customer) {
			dao.save(customer);
		}
}