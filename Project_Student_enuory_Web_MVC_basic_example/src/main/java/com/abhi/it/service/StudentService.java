package com.abhi.it.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.it.Enqiry.Student;
import com.abhi.it.Enqiry.StudentEntity;
import com.abhi.it.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo sr;
	
	public List<String> getShifts(){
		
		return Arrays.asList("Morning", "Afternoon", "Evening");
	}

	public List<String> getCourses() {
		
		return Arrays.asList("java", "python", "Devops");
	}

	public boolean saveStudent(Student s) {
		System.out.println(s);
		StudentEntity st = new StudentEntity();
		BeanUtils.copyProperties(s, st);
		st.setTimings(Arrays.toString(s.getTimings()));
		System.out.println(st);
		sr.save(st);
		return true;
	}
}
