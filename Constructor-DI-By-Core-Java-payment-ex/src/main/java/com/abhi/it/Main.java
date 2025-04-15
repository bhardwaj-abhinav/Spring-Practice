package com.abhi.it;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentService pay = new PaymentService(new SodexCard());
		pay.doPayment(200);

	}

}
