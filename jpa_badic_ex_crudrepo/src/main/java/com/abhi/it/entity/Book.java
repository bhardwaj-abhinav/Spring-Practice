package com.abhi.it.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	
	@Id
	private int book_id;
	private String book_name;
	private String author_name;
	
}
