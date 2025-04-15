package com.abhi.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/abhi2")
public class MyController {
	
	@RequestMapping("/hello")
	public String getGreets() {
		return "Good Night";
	}
}
