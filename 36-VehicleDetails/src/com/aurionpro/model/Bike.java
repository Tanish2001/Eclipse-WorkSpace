package com.aurionpro.model;

import java.time.LocalDate;

public class Bike extends Vehicle implements IMovable{

	public Bike(String model, LocalDate doM) {
		super(model, doM);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bike is moving");
		
	}

	@Override
	public void ShowTopSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Top speed of bike is 200 kmph");
	}

}
