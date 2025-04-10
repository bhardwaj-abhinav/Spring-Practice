package com.abhi.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.it.entity.Employee;
import com.abhi.it.repo.EmployeeRepo;

@SpringBootApplication
public class GeneratorsForIdApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GeneratorsForIdApplication.class, args);
		EmployeeRepo empRepo = context.getBean(EmployeeRepo.class);
		Employee e = new Employee();
		e.setEmpName("Shweta");
		e.setEmpDept("spring");
		e.setEmpSalary(1000000);
		e.setGender("Female");
		
		empRepo.save(e);
	}

}
