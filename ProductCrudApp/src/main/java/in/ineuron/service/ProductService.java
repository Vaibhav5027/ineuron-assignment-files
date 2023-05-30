package in.ineuron.service;

import java.util.List;

import in.ineuron.model.Product;

public interface ProductService {
	public String addProduct(Product product);

	public Product getProduct(Integer pid);
	public List<Product> getProducts();

	public Product updateProduct(Product product);

	public void deleteProduct(Integer pid);

	String addProducts(List<Product> product);
}
