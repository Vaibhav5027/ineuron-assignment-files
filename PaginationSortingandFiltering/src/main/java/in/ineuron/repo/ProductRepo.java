package in.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

	

}
