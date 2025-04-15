package com.abhi.it;

public class PaymentService{
	IPayment payment;
	
	public PaymentService(IPayment payment) {
		this.payment = payment;
	}
	
	public void doPayment(int amt) {
		payment.processPayment(amt);
		System.out.println("Payment Completed, Thanks!");
	}
}
