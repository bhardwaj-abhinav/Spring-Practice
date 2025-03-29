package com.abhi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.abhi.config.appConfig;
import com.abhi.it.Robot;

@Component
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
		Robot robot = context.getBean(Robot.class);
		boolean isTrue = robot.injectChip();
		if(isTrue == true) {
			System.out.println("You can take your robot....");
		}
		
	}

}
