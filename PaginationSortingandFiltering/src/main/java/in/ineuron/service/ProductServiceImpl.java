package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public List<Product> getProducts() {
//		using pagination and sort by name and in decending orders
		Pageable firstFive=PageRequest.of(0, 5,Sort.by("pname").descending());
		Page<Product> records = repo.findAll(firstFive);
		return records.toList();
			
	}
	@Override
	public void getProductsByPageSize(int size) {
				long count = repo.count();
				long pageCount=count/size;
				pageCount=count%size==0?pageCount:++pageCount;
				for (int i = 0; i < pageCount; i++) {
			
					Pageable pageable = PageRequest.of(i, size);
					Page<Product> page = repo.findAll(pageable);
					page.getContent().forEach(System.out::println);
					System.out.println("-------------------" + (i + 1) + " of :: " + page.getTotalPages());
				
	}
}}
