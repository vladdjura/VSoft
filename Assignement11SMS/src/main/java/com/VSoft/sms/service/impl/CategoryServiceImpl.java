package com.VSoft.sms.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VSoft.sms.model.Category;
import com.VSoft.sms.repository.CategoryRepository;
import com.VSoft.sms.service.CategoryService;
@Service

public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository cRepository ;
	@Autowired
	public CategoryServiceImpl(CategoryRepository cRepository) {
		super();
		this.cRepository = cRepository;
	}
	
	@Override
	public ArrayList<Category> findAllCategories() {
		// TODO Auto-generated method stub
		return (ArrayList<Category>) cRepository.findAll();
	}

	@Override
	public Category findCategoryById(Long id) {
		// TODO Auto-generated method stub
		return cRepository.findById(id).get();
	}

	@Override
	public Category findCategoryByName(String name) {
		// TODO Auto-generated method stub
		return cRepository.findCategoryByName(name);
	}

	@Override
	public Category update(Category c) {
	Category ca = findCategoryById(c.getId());
	if(ca!=null) {
		cRepository.saveAndFlush(c);
		return c;
	}
		return null;
	}

	@Override
	public Category save(Category c) {
		cRepository.save(c);
		return c;
	}
	
	
}
