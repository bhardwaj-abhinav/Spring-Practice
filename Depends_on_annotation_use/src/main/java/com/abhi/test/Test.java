package com.abhi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.AppConfig;
import com.abhi.it.UserDao;
import com.abhi.it.UserService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cxt = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService ser= cxt.getBean(UserService.class);
		ser.processData();;
		ConfigurableApplicationContext context = (ConfigurableApplicationContext)cxt;
		context.close();
	}

}
