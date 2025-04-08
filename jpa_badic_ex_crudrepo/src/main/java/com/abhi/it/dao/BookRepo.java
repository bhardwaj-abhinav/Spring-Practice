package com.abhi.it.dao;

import org.springframework.data.repository.CrudRepository;

import com.abhi.it.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer>{

}
