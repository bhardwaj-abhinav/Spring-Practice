package com.abhi.it;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.it.dao.BookRepo;
import com.abhi.it.entity.Book;

@SpringBootApplication
public class JpaBadicExCrudrepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(JpaBadicExCrudrepoApplication.class, args);
		BookRepo book = cxt.getBean(BookRepo.class);
		System.out.println(book.getClass().getName());
		
		Book b = new Book();
		b.setBook_id(101);
		b.setAuthor_name("Abhinav");
		b.setBook_name("Sita");
		
		book.save(b);
		
		Optional<Book> book_1 = book.findById(101);
		System.out.println(book_1);
	}

}
