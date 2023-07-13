package com.aurionpro.model;

public class Distance {
	private int feet;
	private int inches;
	
	public Distance(int feet, int inches) {
		super();
		this.feet = feet;
		this.inches = inches;
	}
	
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}

	@Override
	public String toString() {
		return "Distance [feet=" + feet + ", inches=" + inches + "]";
	}
	
	
}
