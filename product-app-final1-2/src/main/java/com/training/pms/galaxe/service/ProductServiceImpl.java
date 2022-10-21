package com.training.pms.galaxe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.pms.galaxe.dao.ProductDAO;
import com.training.pms.galaxe.model.Product;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String saveProduct(Product product) {
		String message =null;
		if(product.getPrice() <0 | product.getQuantityOnHand() < 0 )
		{
			message = "Product price or QOH cannot be negative. Not saved.";
		}
		else
		{
			message = "Product Saved successfully. You are genious";
			productDAO.save(product);

		}
		return message;
	}

	// To be continued in online mode .... ####
	
	@Override
	public String updateProduct(Product product) {
		return null;
	}

	@Override
	public String deleteProduct(int productId) {
		return "Product deleted successfully";
	}

	@Override
	public Product getProduct(int productId) {
		return null;
	}

	@Override
	public List<Product> getProduct() {
		return null;
	}

	@Override
	public boolean isProductExists(int productId) {
		return false;
	}

	
	
	
	@Override
	public List<Product> getProduct(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProductByName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProduct(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkProductInventory(int productId, int quantityRequired) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}

}
