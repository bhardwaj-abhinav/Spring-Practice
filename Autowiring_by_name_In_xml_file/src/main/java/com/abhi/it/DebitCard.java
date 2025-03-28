package com.abhi.it;

public class DebitCard implements IPayment{
	
	
	
	public DebitCard() {
		System.out.println("Debit Card service avialable...");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean processPayment(int amt) {
		// TODO Auto-generated method stub
		System.out.println("Amount Debit from your Debit card....");
		return true;
	}
}
