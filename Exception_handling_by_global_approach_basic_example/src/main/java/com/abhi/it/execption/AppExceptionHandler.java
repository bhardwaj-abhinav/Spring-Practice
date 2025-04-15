package com.abhi.it.execption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.abhi.it.controller.DemoCOntroller;

@ControllerAdvice
public class AppExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(DemoCOntroller.class);
	
	@ExceptionHandler(value = Exception.class)
	public String handlingException(Exception ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "error";
	}
}
