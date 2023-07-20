package com.aurionpro.model;

import java.time.LocalDate;

public class Bus extends Vehicle implements IMovable{

	public Bus(String model, LocalDate doM) {
		super(model, doM);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bus is moving");
		
	}

	@Override
	public void ShowTopSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Top speed of bus is 50 kmph");
	}

}
