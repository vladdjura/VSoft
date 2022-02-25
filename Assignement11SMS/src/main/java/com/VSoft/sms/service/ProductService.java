package com.VSoft.sms.service;

import java.util.ArrayList;

import com.VSoft.sms.model.Product;

public interface ProductService {

	ArrayList<Product>FindAllProducts();
	Product findProductById(Long id);
	Product findProductByName(String name);	
	void delete(Long id); 
	Product update(Product p);
	Product save(Product p);
	Product buy(Long id);
	
}
