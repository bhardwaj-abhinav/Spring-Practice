package com.abhi.it;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.it.entity.Book;
import com.abhi.it.repo.BookRepo;

@SpringBootApplication
public class BookProjectWebMvcBasicExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BookProjectWebMvcBasicExampleApplication.class, args);
		BookRepo bookRepo = context.getBean(BookRepo.class);
//		Book b1 = new Book();
//		b1.setBookName("Spring");
//		b1.setBookPrice(1000);
//		
//		Book b2 = new Book();
//		b2.setBookName("Spring Boot");
//		b2.setBookPrice(2000);
//		
//		Book b3 = new Book();
//		b3.setBookName("Devops");
//		b3.setBookPrice(3000);
//		
//		bookRepo.saveAll(Arrays.asList(b1,b2,b3));
//		
	}

}
