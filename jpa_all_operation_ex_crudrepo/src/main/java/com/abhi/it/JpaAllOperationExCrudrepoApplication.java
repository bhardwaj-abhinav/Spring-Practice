package com.abhi.it;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.it.dao.BookRepo;
import com.abhi.it.entity.Book;

@SpringBootApplication
public class JpaAllOperationExCrudrepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(JpaAllOperationExCrudrepoApplication.class, args);
		BookRepo bookRepo = ctxt.getBean(BookRepo.class);
		
		Book b = new Book();
		b.setBook_id(105);
		b.setAuthor_name("Akash");
		b.setBook_name("Abhinav Biopic");
		
		Book b2 = new Book();
		b2.setBook_id(106);
		b2.setAuthor_name("Prachi");
		b2.setBook_name("Gita");
		
		Book b3 = new Book();
		b3.setBook_id(107);
		b3.setAuthor_name("Shubham");
		b3.setBook_name("Kashmir file");
		
		bookRepo.save(b);
		
		bookRepo.saveAll(Arrays.asList(b2, b3));
		
		System.out.println(bookRepo.existsById(102));
		
		System.out.println(bookRepo.count());
		
		Optional<Book> book=bookRepo.findById(101);
		System.out.println(book);
		
		Iterable<Book> books=bookRepo.findAllById(Arrays.asList(102,103));
		for(Book bk : books) {
			System.out.println(bk);
		}
		
		Iterable<Book> AllBooks = bookRepo.findAll();
		System.out.println(AllBooks);
		
		bookRepo.delete(b3);
		bookRepo.deleteAll(Arrays.asList(b,b2));
		
	}

}
