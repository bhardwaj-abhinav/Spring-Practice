package com.abhi.it;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
public class Chip {
	public Chip() {
		System.out.println("Chip is created....");
	}
	
	public boolean chip() {
		System.out.println("32-bit Chip....");
		return true;
	}
}
