package com.abhi.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.abhi.it.Enqiry.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
