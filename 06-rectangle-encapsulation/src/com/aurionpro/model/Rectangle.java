package com.aurionpro.model;

public class Rectangle {
	 
	private double height ;
	private double width;
	private String name;
	private double calculateArea = height*width;
	
	public void setHeight(double height) {
		if (height<1) {
			this.height = 1;
			}
		else if (height>100) {
			this.height = 100;
		}
		else {
			this.height = height;
		}
		
	}
	
	public void setWidth(double width) {
		if (width<1) {
			this.width = 1;
			}
		else if (width>100) {
			this.width = 100;
		}
		else {
			this.width = width;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public String getName() {
		return name;
	}
	
	
	public double calculateArea() {
		// TODO Auto-generated method stub
		double area = height*width;
		//System.out.println("Area of "+name+" is "+area);
		return area;
	}

}
