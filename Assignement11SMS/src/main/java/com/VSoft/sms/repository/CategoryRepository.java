package com.VSoft.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VSoft.sms.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category findCategoryByName(String Name);
	
}
