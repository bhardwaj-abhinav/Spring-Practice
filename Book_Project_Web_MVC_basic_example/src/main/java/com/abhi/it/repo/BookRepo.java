package com.abhi.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.it.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
