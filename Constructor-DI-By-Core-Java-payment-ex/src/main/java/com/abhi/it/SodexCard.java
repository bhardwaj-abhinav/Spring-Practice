package com.abhi.it;

public class SodexCard implements IPayment{

	@Override
	public boolean processPayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Sodex Payment in process....");
		return true;
	}
	
}
