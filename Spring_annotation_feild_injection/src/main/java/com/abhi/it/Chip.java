package com.abhi.it;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	public Chip() {
		System.out.println("Chip is created....");
	}
	
	public boolean chip() {
		System.out.println("32-bit Chip....");
		return true;
	}
}
