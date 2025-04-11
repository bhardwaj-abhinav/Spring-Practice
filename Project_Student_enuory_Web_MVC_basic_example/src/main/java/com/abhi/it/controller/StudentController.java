package com.abhi.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.abhi.it.Enqiry.Student;
import com.abhi.it.service.StudentService;



@Controller
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@GetMapping("/")
	public String studentForm(Model model) {
		model.addAttribute("student", new Student());
		getInit(model);
		return "index";
	}

	private void getInit(Model model) {
		model.addAttribute("course", ss.getCourses());
		model.addAttribute("shift", ss.getShifts());
	}
	
	@PostMapping("/save")
	public String saveStudentForm(Student s ,Model model) {
		System.out.println(s);
		boolean isSaved = ss.saveStudent(s);
		if(isSaved) {
			model.addAttribute("msg", "Data Saved...");
		}
		
		getInit(model);
		return "index";
	}
	
}
