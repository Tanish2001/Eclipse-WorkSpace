package com.aurionpro.model;

import java.time.LocalDate;

public abstract class Vehicle {
	private String model;
	private LocalDate DoM;
	
	public Vehicle(String model, LocalDate doM) {
		super();
		this.model = model;
		DoM = doM;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDate getDoM() {
		return DoM;
	}

	public void setDoM(LocalDate doM) {
		DoM = doM;
	}

	public abstract void ShowTopSpeed();

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", DoM=" + DoM + "]";
	}
	
	
}
