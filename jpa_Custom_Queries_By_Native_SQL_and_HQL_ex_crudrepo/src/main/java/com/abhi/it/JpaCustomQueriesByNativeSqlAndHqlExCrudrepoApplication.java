package com.abhi.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.it.dao.BookRepo;

@SpringBootApplication
public class JpaCustomQueriesByNativeSqlAndHqlExCrudrepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(JpaCustomQueriesByNativeSqlAndHqlExCrudrepoApplication.class, args);
		BookRepo bookRepo = cxt.getBean(BookRepo.class);
		System.out.println(bookRepo.getAllbooks());
		System.out.println(bookRepo.getbooks());
	}

}
