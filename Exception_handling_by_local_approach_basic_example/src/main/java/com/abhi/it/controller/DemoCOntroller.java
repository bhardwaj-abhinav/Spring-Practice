package com.abhi.it.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoCOntroller {
	
	private Logger logger = LoggerFactory.getLogger(DemoCOntroller.class);
	
	@GetMapping("/")
	public String getWelcome(Model model) {
		String msg = "Hi All, Welcome....";
		Integer i = 10/0;
		model.addAttribute("msg" ,msg);
		return "index";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String handlingException(Exception ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "error";
	}
	
}
