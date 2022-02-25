package com.VSoft.sms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.VSoft.sms.model.User;
import com.VSoft.sms.service.impl.ProductServicImpl;
import com.VSoft.sms.service.impl.UserServiceImpl;

@Controller

public class LoginController {

	private final UserServiceImpl serviceImpl;
	private final ProductServicImpl impl;
	public LoginController(UserServiceImpl serviceImpl, ProductServicImpl impl) {
		super();
		this.serviceImpl = serviceImpl;
		this.impl = impl;
	}
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public ModelAndView loginPage() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("user", new User());
		
		return modelAndView;
		
	}
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public ModelAndView login(User user, HttpSession session) {
		User u  =serviceImpl.login(user.getUsername(), user.getPassword());
		ModelAndView modelAndView = new ModelAndView();
		if( u!=null ) {
			modelAndView.setViewName("view-product");
			modelAndView.addObject("products", impl.FindAllProducts());
			session.setAttribute("role", u.getRole());
			modelAndView.addObject("role",session.getAttribute("role"));
			
		}else {
		
			modelAndView.setViewName("index");
			modelAndView.addObject("user", new User());
			modelAndView.addObject("error","username or password is wrong");
			
		}
		
		
		
		return modelAndView;
		
	}
}
