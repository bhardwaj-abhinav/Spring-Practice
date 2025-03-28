package com.abhi.it;

public class DieselEngine implements Engine{
	
	public DieselEngine() {
		System.out.println("Its Diesel Engine");
	}

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		System.out.println("Diesel Engine started");
		return true;
	}

}
