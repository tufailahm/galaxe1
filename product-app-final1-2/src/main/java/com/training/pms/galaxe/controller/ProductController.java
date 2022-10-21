package com.training.pms.galaxe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.galaxe.dao.ProductDAO;
import com.training.pms.galaxe.model.Product;
import com.training.pms.galaxe.service.ProductService;

@RestController
@RequestMapping("product")
//@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

	@Autowired
	ProductService productService;

	String message;

	@PostMapping // http://localhost:9090/product/ - POST - BODY
	public String saveProduct(@RequestBody Product product) {
			return productService.saveProduct(product);
		
	}

	@GetMapping // http://localhost:9090/product
	public List<Product> getProducts() {
			return null;
	}

	public ProductController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("{productId}") // http://localhost:9090/product/198
	public String getProduct(@PathVariable("productId") Integer productId) {
		return "Getting a single products for " + productId;
	}

	@DeleteMapping("{productId}") // http://localhost:9090/product/198 - DELETE
	public String deleteProduct(@PathVariable("productId") Integer productId) {
		return "Deleting a single products";
	}

	@PutMapping // http://localhost:9090/product/ - PUT - BODY
	public String updateProduct(@RequestBody Product product) {
		return "product updated successfully";
	}
}
