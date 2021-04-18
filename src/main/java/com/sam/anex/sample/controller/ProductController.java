package com.sam.anex.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sam.anex.sample.model.Product;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {
	@PostMapping(value = "products/save")
	public Product saveProduct(@RequestBody Product product) {
		System.out.println("log - "+product);
		return product;
	}
	
	@GetMapping(value = "products/get")
	public List<Product> getProducts() {
		List<Product> pList = new ArrayList<>();
		pList.add(new Product("p1", "d1", 20.0d));
		pList.add(new Product("p2", "d2", 20.0d));
		pList.add(new Product("p3", "d3", 20.0d));
		pList.add(new Product("p4", "d4", 20.0d));
		pList.add(new Product("p5", "d5", 20.0d));
		return pList;
	}
	
	@GetMapping(value = "products/edit/{productName}")
	public Product editProduct(@PathVariable("productName") String productName) {
		System.out.println("---> " + productName);
		return new Product("p1", "d1", 20.0f);
	}

	@PutMapping(value = "products/update")
	public Product updateProduct(@RequestBody Product product) {
		System.out.println("---> " + product);
		return product;
	}
	
	@GetMapping(value = "products/delete/{productName}")
	public String deleteProduct(@PathVariable("productName") String productName) {
		System.out.println("---> " + productName);
		return "deleted";
	}
}
