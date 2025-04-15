package com.abhi.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abhi.it.service.MyService;

@Controller
public class MyController {
	
	@Autowired
	private MyService service;
	
	@GetMapping("/hello")
	public String getgreet(Model model) {
		String msg = service.getdetails();
		model.addAttribute("msg" ,msg);
		return "index";
	}
}
