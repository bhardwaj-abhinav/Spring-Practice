package com.abhi.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/welcome")
	public ModelAndView getWelcome() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Hi I am Abhinav");
		mav.setViewName("message");
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to my world!");
		mav.setViewName("message");
		return mav;
	}
}
