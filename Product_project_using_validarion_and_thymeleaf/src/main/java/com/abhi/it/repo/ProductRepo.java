package com.abhi.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.it.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
	
}
