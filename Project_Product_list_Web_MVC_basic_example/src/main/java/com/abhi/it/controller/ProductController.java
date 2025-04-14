package com.abhi.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.abhi.it.entity.Product;
import com.abhi.it.repo.ProductRepo;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepo pr;
	
	@GetMapping("/")
	public String submitProduct(Model model){
		model.addAttribute("p", new Product());
		return "index";
	}
	
	@PostMapping("/product")
	public String addProduct(@ModelAttribute("p") Product p, Model model) {
		p = pr.save(p);
		if(p.getID()!= null) {
			model.addAttribute("msg", "Product added....");
		}
		
		return "index";
	}
	
	@GetMapping("/products")
	public String getProducts(Model model) {
		model.addAttribute("p", pr.findAll());
		return "data";
	}
}
