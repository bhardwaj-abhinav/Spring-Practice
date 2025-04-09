package com.abhi.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.it.entity.Employee;
import com.abhi.it.repo.EmployeeRepo;

@SpringBootApplication
public class TImeStampInDatabaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TImeStampInDatabaseApplication.class, args);
		EmployeeRepo empRepo = context.getBean(EmployeeRepo.class);
		Employee e = new Employee();
		e.setEmpId(7);
		e.setEmpName("Mayank");
		e.setEmpDept("Data Cience");
		e.setEmpSalary(1000000);
		e.setGender("Male");
		
		empRepo.save(e);
	}

}
