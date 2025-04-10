package com.abhi.it.controller;

import java.util.Optional;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.it.entity.Book;
import com.abhi.it.repo.BookRepo;

import ch.qos.logback.core.model.Model;

@Controller
public class MyController {

	@Autowired
	BookRepo bookRepo;
	
	//Model and view approch
//	@GetMapping("/book")
//	public ModelAndView getBook(@RequestParam("ID") Integer ID) {
//		ModelAndView mav = new ModelAndView();
//		
//		Optional<Book> bookObj = bookRepo.findById(ID);
//		if(bookObj.isPresent()) {
//			System.out.println(bookObj);
//			Book book = bookObj.get();
//			mav.addObject("book", book);
//		}
//		
//		mav.setViewName("index");
//		
//		return mav;
//	}
	
	//same above code but using string and modal instead of modal and view
	@GetMapping("/book")
	public String getBook(@RequestParam("ID") Integer ID, org.springframework.ui.Model model) {
		
		Optional<Book> bookObj = bookRepo.findById(ID);
		if(bookObj.isPresent()) {
			System.out.println(bookObj);
			Book book = bookObj.get();
			model.addAttribute("book", book);
		}
		
		return "index";
	}

}
