package com.abhi.it;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	@Autowired
	private Chip chip;
	
	public Robot() {
		System.out.println("Robot is ready.....");
	}
	
	public boolean injectChip() {
		boolean isTrue = chip.chip();
		if(isTrue == true) {
			System.out.println("Chip is injecting in Robot....");
			return true;
		}
		return false;
	}
}
