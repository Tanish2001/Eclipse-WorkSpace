package com.aurionpro.model;

public class circle {
	private double radius;
	private Color color;
	private BorderType border;
	
	
	public void setRadius(double radius) {
		this.radius= radius; 
	}
	
	public void setColor(Color color) {
		this.color= color; 
	}
	
	public void setBorderType(BorderType border) {
		this.border= border; 
	}
	
	public double getRadius() {
		return radius;
	}
	
	public Color getColor() {
		return color;
	}
	
	public BorderType getBorder() {
		return border;
	}
	
	public double CalculateArea() {
		double area= 3.142*radius*radius;
//		System.out.println("Area is "+area);
		return area;
	}
	
	public double CalculatePeri() {
		double peri = 2*3.142*radius;
//		System.out.println("Primeter is "+peri);
		return peri;
	}
}
