package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Product;

public interface ProductService {
	
	public List<Product> getProducts();

	void getProductsByPageSize(int size);

}
