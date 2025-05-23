package com.abhi.it.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Book_table")
public class Book {
	
	@Id
	@GeneratedValue
	private Integer bookId;
	private String bookName;
	private Integer bookPrice;
}
