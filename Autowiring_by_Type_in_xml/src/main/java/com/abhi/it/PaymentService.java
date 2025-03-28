package com.abhi.it;

public class PaymentService {
	IPayment payment;
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	
	public boolean doPayment(int amt) {
		System.out.println("Start Processing......");
		payment.processPayment(amt);
		return true;
	}
}
