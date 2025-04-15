package com.abhi.it;

public class CreditCard implements IPayment{

	@Override
	public boolean processPayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit Payment in process....");
		return true;
	}

}
