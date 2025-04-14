package com.abhi.it.controller;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abhi.it.entity.Product;
import com.abhi.it.repo.ProductRepo;

@Controller
public class MyController {
	
	@Autowired
	private ProductRepo pr;
	
	@GetMapping("/edit")
	public String edit(@RequestParam("pid") Integer id, Model model) {
		 java.util.Optional<Product> findProduct = pr.findById(id);
		 if(findProduct.isPresent()) {
			 Product product = findProduct.get();
			 model.addAttribute("product", product);
		 }
		 
		 return "index";
	}
	
	@GetMapping("/")
	public String addProduct(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}
	
	@GetMapping("/products")
	public String getProduct(Model model) {
		model.addAttribute("products", pr.findAll());
		return "data";
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("pid") Integer id ,Model model) {
		pr.deleteById(id);
		model.addAttribute("products", pr.findAll());
		model.addAttribute("msg", "Product Deleted...");
		return "data";
	}
	
	
	@PostMapping("/product")
	public String addProducts(@ModelAttribute("product") Product p, BindingResult result ,Model model) {
        
		if(result.hasErrors()) {
			return "index";
		}
		
		p = pr.save(p);
        
        if(p.getPid() != null) {
        	model.addAttribute("msg", "Product saved...");
        }
		return "index";
	}
	
}
