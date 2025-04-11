package com.abhi.it.Enqiry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Student {
	private String studentName;
	private String studentEmail;
	private String courses;
	private String[] timings;
	private String gender;
}
