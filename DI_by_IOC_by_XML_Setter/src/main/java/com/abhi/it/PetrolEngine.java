package com.abhi.it;

public class PetrolEngine implements Engine{

	public PetrolEngine() {
		System.out.println("Its Petrol Engine");
	}
	
	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		System.out.println("Petrol Engine started");
		return true;
	}
	
}
