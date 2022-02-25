package com.VSoft.sms.service;

import java.util.ArrayList;

import com.VSoft.sms.model.Category;
import com.VSoft.sms.model.Product;

public interface CategoryService {

	ArrayList<Category>findAllCategories();
	Category findCategoryById(Long id);
	Category findCategoryByName(String name);	
	Category update(Category c);
	Category save(Category c);
	
	
}
