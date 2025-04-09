package com.abhi.it.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private Integer empSalary;
	private String empDept;
	private String gender;
}
