import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface DataRepo extends MongoRepository<Products, String> {
}