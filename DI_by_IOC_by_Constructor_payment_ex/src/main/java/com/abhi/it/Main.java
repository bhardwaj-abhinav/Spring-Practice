package com.abhi.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		PaymentService service = context.getBean(PaymentService.class);
		service.doPayment(500);
		System.out.print("Thanks for shopping....");
	}

}
