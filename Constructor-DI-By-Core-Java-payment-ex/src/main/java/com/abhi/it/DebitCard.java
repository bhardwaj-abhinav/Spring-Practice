package com.abhi.it;

public class DebitCard implements IPayment{

	@Override
	public boolean processPayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Debit Payment in process....");
		return true;
	}

}
