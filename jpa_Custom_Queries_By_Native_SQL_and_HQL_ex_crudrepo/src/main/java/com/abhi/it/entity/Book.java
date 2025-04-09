package com.abhi.it.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	
	@Id
	private int bookId;
	private String bookName;
	private String authorName;
	
}
