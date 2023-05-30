package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.exception.OtherException;
import in.ineuron.exception.ProductNotFound;
import in.ineuron.model.Product;
import in.ineuron.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;

	@Override
	public String addProduct(Product product) {

//		Product prod = repo.findById(product.getPid()).orElseThrow(() -> new ProductNotFound("Product already available"));

		repo.save(product);
		return "Product saved to cart";
	}

	@Override
	public String addProducts(List<Product> product) {
		List<Product> saveAll = repo.saveAll(product);
		if (saveAll == null)
			throw new OtherException("oops!! something wrong");
		return "product list updated succesfully";
	}

	@Override
	public Product getProduct(Integer pid) {
		Product product = repo.findById(pid)
				.orElseThrow(() -> new ProductNotFound("product not available with) id ::" + pid));
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
       Optional<Product> prod = repo.findById(product.getPid());
       if(prod.isEmpty()) {
    	   throw new ProductNotFound("product not found with id :"+product.getPid());
       }
       Product prod1=new Product();
		prod1.setPid(product.getPid());
		prod1.setCompany(product.getCompany());
		prod1.setPname(product.getPname());
		prod1.setPrice(product.getPrice());

		Product updatedProduct = repo.save(prod1);
		return updatedProduct;
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = repo.findAll();
		if (products == null)
			throw new ProductNotFound("Products not found");
		return products;
	}

	@Override
	public void deleteProduct(Integer pid) {
		Product prod = repo.findById(pid).orElseThrow(()->new ProductNotFound("Product not available with id:"+pid));;
		
			repo.deleteById(pid);
	}

}
