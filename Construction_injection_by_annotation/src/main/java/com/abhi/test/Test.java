package com.abhi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhi.AppConfig;
import com.abhi.it.ReportService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service = context.getBean(ReportService.class);
		service.reportProcessing();
	}

}
