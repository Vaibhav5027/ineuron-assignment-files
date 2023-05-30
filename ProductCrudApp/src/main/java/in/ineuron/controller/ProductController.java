package in.ineuron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Product;
import in.ineuron.service.ProductService;

@RestController
@RequestMapping("api/product/")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("add")
	ResponseEntity<String> addProdutToCart(@RequestBody Product product) {
		String result = service.addProduct(product);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

	@PostMapping("addAll")
	ResponseEntity<String> addAllProducts(@RequestBody List<Product> product){
		String msg=service.addProducts(product);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	

	@GetMapping("findById/{id}")
	ResponseEntity<?> getProduct(@PathVariable Integer id) {
		Product product = service.getProduct(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	@GetMapping("findall")
	ResponseEntity<List<Product>> getAllProduct() {
		List<Product> products = service.getProducts();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	@PostMapping(value="update")
	ResponseEntity<Product> updateProduct(@RequestBody Product prodcut){
		Product updatedProduct = service.updateProduct(prodcut);
	return new ResponseEntity<Product>(updatedProduct,HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	ResponseEntity<String> deleteProduct(@PathVariable Integer id){
		service.deleteProduct(id);
		return new ResponseEntity<String>("Product deleted succesfully",HttpStatus.OK);
	}
}
