package com.abhi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhi.it.UserDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cxt = new AnnotationConfigApplicationContext("AppConfig.class");
		
		UserDao dao = cxt.getBean(UserDao.class);
		dao.getData();
		ConfigurableApplicationContext context = (ConfigurableApplicationContext)cxt;
		context.close();
	}

}
