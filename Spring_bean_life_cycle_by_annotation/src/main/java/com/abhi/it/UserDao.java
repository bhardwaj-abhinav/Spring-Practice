package com.abhi.it;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao{
	
	public UserDao() {
		System.out.print("Obj is created....");
	}
	
	public void getData() {
		System.out.println("Data is genrated...");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("obj is destroyed");
		
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("obj is created");
	}
	
	
}
