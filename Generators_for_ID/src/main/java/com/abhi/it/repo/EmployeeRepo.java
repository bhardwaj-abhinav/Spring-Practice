package com.abhi.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.it.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
