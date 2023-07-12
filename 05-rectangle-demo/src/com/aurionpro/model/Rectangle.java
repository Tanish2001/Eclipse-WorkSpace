package com.aurionpro.model;

public class Rectangle {
	 
	public double height ;
	public double width;
	public String name;
	public double calculateArea = height*width;
	public double calculateArea() {
		// TODO Auto-generated method stub
		double area = height*width;
		System.out.println("Area of "+name+" is "+area);
		return area;
	}

}
