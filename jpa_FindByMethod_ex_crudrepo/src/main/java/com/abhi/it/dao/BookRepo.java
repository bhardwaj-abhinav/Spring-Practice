package com.abhi.it.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.abhi.it.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer>{

	public List<Book> findByBookName(String BookName);
}
