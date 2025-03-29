package com.abhi.it;

public class PaymentService {
	IPayment payment;
	
	public PaymentService() {
		System.out.println("2 payments option is available...");
	}
	
	public PaymentService(IPayment payment) {
		this.payment = payment;
	}
	
	public boolean doPayment(int amt) {
		System.out.println("Start Processing......");
		payment.processPayment(amt);
		return true;
	}
}
