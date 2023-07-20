package com.aurionpro.model;

import java.time.LocalDate;

public class Car extends Vehicle implements IMovable {

	public Car(String model, LocalDate doM) {
		super(model, doM);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving");
		
	}

	@Override
	public void ShowTopSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Top speed of car is 100 kmph");
	}

}
