package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.name  = "rectangle1";
		rectangle.height = 10;
		rectangle.width = 10;
		rectangle.calculateArea();
		//System.out.println("Area of rectangle is "+rectangle.calculateArea());
		
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.name = "rectangle2";
		rectangle2.height = 30;
		rectangle2.width= 40;
		rectangle2.calculateArea();
		//System.out.println("Area of Rectangle2 is "+rectangle2.calculateArea());
	}

}
