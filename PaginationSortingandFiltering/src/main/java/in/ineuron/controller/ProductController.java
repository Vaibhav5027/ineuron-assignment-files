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
	
	@GetMapping("findall")
	ResponseEntity<List<Product>> getAllProduct() {
		List<Product> products = service.getProducts();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	@GetMapping("findall/{size}")
	ResponseEntity<String> getAllProductWithPagesize(@PathVariable Integer size) {
		service.getProductsByPageSize(size);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
}
