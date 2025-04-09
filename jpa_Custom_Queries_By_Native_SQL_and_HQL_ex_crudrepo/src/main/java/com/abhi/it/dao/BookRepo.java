package com.abhi.it.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.abhi.it.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer>{

	@Query(value = "Select * from book", nativeQuery=true)
	public List<Book> getAllbooks();
	
	@Query("from Book")
	public List<Book> getbooks();
	
	
	
}
