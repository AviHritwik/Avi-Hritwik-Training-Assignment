package cap.q9.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends CrudRepository<Customer, Long>{
	
}