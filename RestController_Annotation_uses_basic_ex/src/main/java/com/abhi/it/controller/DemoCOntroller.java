package com.abhi.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCOntroller {
	
	@GetMapping("/")
	public String getWelcome(Model model) {
		String msg = "Hi All, Welcome....";
		model.addAttribute("msg" ,msg);
		return "index";
	}
	
	@GetMapping("/hello")
	public String getGreet() {
		String msg = "Good Morning";
		return msg;
	}
}
