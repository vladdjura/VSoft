package com.VSoft.sms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.VSoft.sms.model.Product;
import com.VSoft.sms.service.impl.CategoryServiceImpl;
import com.VSoft.sms.service.impl.ProductServicImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/product")
public class ProductController {

	private final ProductServicImpl impl;
	private final CategoryServiceImpl cat;

	@Autowired
	public ProductController(ProductServicImpl impl, CategoryServiceImpl cat) {
		super();
		this.impl = impl;
		this.cat = cat;
	}

	@RequestMapping(value = "find-all", method = RequestMethod.GET)
	public ModelAndView viewProductPage(HttpSession session) {
		System.out.println(session.getAttribute("role") + "++++++++");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view-product");
		modelAndView.addObject("role",session.getAttribute("role"));

		modelAndView.addObject("products", impl.FindAllProducts());
		return modelAndView;

	}

	@RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
	public ModelAndView updateProductPage(@PathVariable long id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("add-edit-product");
		Product p = impl.findProductById(id);
		System.out.println("++++" + p.toString());
		modelAndView.addObject("pr", impl.findProductById(id));
		modelAndView.addObject("flag", "false");

		modelAndView.addObject("categories", cat.findAllCategories());
		modelAndView.addObject("pageTitle", "welcome to updated page");
		modelAndView.addObject("button", "update");
		return modelAndView;

	}

	@RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
	public ModelAndView updatedProductPage(Product product,HttpSession session) {
		System.out.println(product.toString());
		impl.update(product);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("role",session.getAttribute("role"));

		modelAndView.setViewName("view-product");
		modelAndView.addObject("products", impl.FindAllProducts());

		return modelAndView;
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView addPage(Product product) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("add-edit-product");
		modelAndView.addObject("pr", new Product());
		modelAndView.addObject("flag", "true");
		modelAndView.addObject("categories", cat.findAllCategories());
		modelAndView.addObject("pageTitle", "welcome to insert product page");
		modelAndView.addObject("button", "add");
		return modelAndView;
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView saveProduct(Product product,HttpSession session) {
		impl.save(product);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view-product");
		modelAndView.addObject("role",session.getAttribute("role"));

		modelAndView.addObject("products", impl.FindAllProducts());

		return modelAndView;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteProduct(@PathVariable long id,HttpSession session) {
		impl.delete(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view-product");
		modelAndView.addObject("role",session.getAttribute("role"));

		modelAndView.addObject("products", impl.FindAllProducts());

		return modelAndView;

	}

	@RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
	public ModelAndView buyProduct(@PathVariable long id,HttpSession session) {
		impl.buy(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view-product");
		modelAndView.addObject("role",session.getAttribute("role"));

		modelAndView.addObject("products", impl.FindAllProducts());

		return modelAndView;

	}
}
