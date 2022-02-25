package com.VSoft.sms.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VSoft.sms.model.Category;
import com.VSoft.sms.model.Product;
import com.VSoft.sms.repository.CategoryRepository;
import com.VSoft.sms.repository.ProductRepository;
import com.VSoft.sms.service.ProductService;

import lombok.RequiredArgsConstructor;

@Service


public class  ProductServicImpl implements ProductService {
	
	private final ProductRepository productRepository;
	private final CategoryRepository categoryRepository;
	
	@Autowired
	public ProductServicImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
		super();
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}

	@Override
	public ArrayList<Product> FindAllProducts() {
		// TODO Auto-generated method stub
		return (ArrayList<Product>) productRepository.findAll();
	}

	@Override
	public Product findProductById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
		
	}

	@Override
	public Product findProductByName(String name) {
		// TODO Auto-generated method stub
		return productRepository.findProductByProductName(name);
		
	}

	@Override
	public void delete(Long id) {
		System.out.println("aaaaa");
		productRepository.deleteById(id);
	}

	@Override
	public Product update(Product p) {
		Product pr=findProductById(p.getId());
		if(pr!=null) {
			Category c= categoryRepository.findById(p.getCatId()).get();
			p.setCategory(c);
			productRepository.saveAndFlush(p);
		}
		return null;
	}

	@Override
	public Product save(Product p) {
	if(p!=null) {
		Category c= categoryRepository.findById(p.getCatId()).get();
		p.setCategory(c);
		productRepository.save(p);
		return p;
	}
		return null;
	}

	@Override
	public Product buy(Long id) {
		Product p = findProductById(id);
		p.setQuantity(p.getQuantity()-1);
		productRepository.saveAndFlush(p);
		return p;
	}

}
