package com.VSoft.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VSoft.sms.model.Product;

@Repository
public interface  ProductRepository extends JpaRepository<Product, Long> {

	Product findProductByProductName(String productName);
	
	
}
