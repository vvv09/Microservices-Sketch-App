package my.microservices.sketch.product.service.repository;

import my.microservices.sketch.product.service.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
