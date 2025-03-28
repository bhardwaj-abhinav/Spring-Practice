package com.abhi.it;

public class CreditCard implements IPayment{

	public CreditCard() {
		System.out.println("Credit Card service avialable...");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean processPayment(int amt) {
		// TODO Auto-generated method stub
		System.out.println("Amount Debit from your credit card....");
		return true;
	}
	

}
