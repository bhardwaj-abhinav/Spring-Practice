package com.abhi.it;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;

import com.abhi.it.entity.Employee;
import com.abhi.it.repo.EmployeeRepo;

@SpringBootApplication
public class JpaRepositoryPaginationSortingQbePracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaRepositoryPaginationSortingQbePracticeApplication.class, args);
		EmployeeRepo empRepo = context.getBean(EmployeeRepo.class);
		
//		Employee emp = new Employee(1, "Abhinav", 20000, "CSE", "Male");
//		Employee emp1 = new Employee(2, "Prachi", 25000, "IT", "Female");
//		Employee emp2 = new Employee(3, "Shubham", 30000, "CSE", "Male");
//		Employee emp3 = new Employee(4, "Akash", 300000, "Pharmecy", "Male");
//		Employee emp4 = new Employee(5, "Chhavi", 2000, "Math", "Female");
//		
//		empRepo.saveAll(Arrays.asList(emp, emp1, emp2, emp3, emp4));
		
		//normal findAll method
		List<Employee> emps = empRepo.findAll();
		emps.forEach(System.out::println);
		
		//Sorting method
		Sort sort = Sort.by("empSalary", "empName").ascending();
		List<Employee> empss = empRepo.findAll(sort);
		empss.forEach(System.out::println);
		
		//Pagination method
		int page_no = 1;
		PageRequest pageRequest = PageRequest.of(page_no-1, 2);
		Page<Employee> pageEmp = empRepo.findAll(pageRequest);
		List<Employee> empsss = pageEmp.getContent();
		empsss.forEach(System.out::println);
		
		//QBE Example
		Employee e = new Employee();
		e.setGender("Male");
		e.setEmpDept("CSE");
		Example<Employee> exp = Example.of(e);
		List<Employee> empssss = empRepo.findAll(exp);
		empssss.forEach(System.out::println);
	}

}
