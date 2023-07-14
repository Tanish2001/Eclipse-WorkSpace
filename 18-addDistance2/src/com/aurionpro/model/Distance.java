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
	
	public Distance addDistance(Distance d) {
		int incheOverflow =0;
		int feetSum = this.getFeet()+d.getFeet();
		int incheSum = this.getInches()+d.getInches();
		while (incheSum>12) {
			incheSum-=12;
			incheOverflow+=1;
		}
		feetSum+=incheOverflow;
		Distance updatedDistance = new Distance(feetSum, incheSum);
		return updatedDistance;
	}
	
	
}
