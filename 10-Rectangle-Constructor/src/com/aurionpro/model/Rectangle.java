package com.aurionpro.model;

public class Rectangle {

	private double height;
	private double width;
	private String name;
	private Color color;
	private double calculateArea = height * width;
	
	public Rectangle(double height, double width,Color color) {
		this.height = 20.2;
		this.width = 30.2;
		this.color = Color.BLUE;
		
	}
	
	public Rectangle() {
		this.height = 0;
		this.width = 0;
		this.color = Color.RED;
		
	}
	

	public void setColor(Color color) {
		this.color=color;
//		if (color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("green")) {
//			this.color = color;
//		} else {
//			this.color = "red";
//		}
	}

	public void setHeight(double height) {
		if (height < 1) {
			this.height = 1;
		} else if (height > 100) {
			this.height = 100;
		} else {
			this.height = height;
		}

	}

	public void setWidth(double width) {
		if (width < 1) {
			this.width = 1;
		} else if (width > 100) {
			this.width = 100;
		} else {
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

	public Color getColor() {
		return color;
	}

	public double calculateArea() {
		// TODO Auto-generated method stub
		double area = height * width;
		// System.out.println("Area of "+name+" is "+area);
		return area;
	}

}
