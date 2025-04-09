package com.abhi.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.it.dao.BookRepo;
import com.abhi.it.entity.Book;

@SpringBootApplication
public class JpaFindByMethodExCrudrepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(JpaFindByMethodExCrudrepoApplication.class, args);
		BookRepo bookRepo = cxt.getBean(BookRepo.class);
		Iterable<Book> book = bookRepo.findByBookName("Sita");
		System.out.println(book);
		
	}

}
