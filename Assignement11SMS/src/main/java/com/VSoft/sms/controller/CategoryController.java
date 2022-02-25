package com.VSoft.sms.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.VSoft.sms.model.Category;
import com.VSoft.sms.service.impl.CategoryServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryController {
	
	private final CategoryServiceImpl categoryServiceImpl;
	@Autowired
	public CategoryController(CategoryServiceImpl categoryServiceImpl) {
		super();
		this.categoryServiceImpl = categoryServiceImpl;
	}
	@RequestMapping(name = "/",method = RequestMethod.GET)
	public ResponseEntity<?>findCategory(@PathParam(value = "id") long id, @PathParam(value = "name") String name){
		if(id!=0) {
			return new  ResponseEntity<>(categoryServiceImpl.findCategoryById(id),HttpStatus.OK);
			
		}else if(!name.equals("null")) {
			return new ResponseEntity<>(categoryServiceImpl.findCategoryByName(name),HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<>(categoryServiceImpl.findAllCategories(),HttpStatus.OK);
		}
		
		
		
	}
	@RequestMapping(name = "/",method = RequestMethod.POST)
	public ResponseEntity<?>save(@RequestBody Category category){
		if(category!=null) {
			return new ResponseEntity<>(categoryServiceImpl.save(category),HttpStatus.CREATED);
			
		}
		return null;
		
	}
	@RequestMapping(name = "/",method = RequestMethod.PUT)
	
	public ResponseEntity<?>update(@RequestBody Category category){
	if(category!=null) {
		return new ResponseEntity<>(categoryServiceImpl.update(category),HttpStatus.OK);
		
	}
	return null;
	
}
}
