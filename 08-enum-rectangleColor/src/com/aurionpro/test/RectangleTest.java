package com.aurionpro.test;

import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(1000);
		rectangle.setWidth(3);
		rectangle.setName("rectangle1");
		rectangle.setColor(Color.RED);
		rectangle.calculateArea();
		System.out.println("Height of " + rectangle.getName() + " is " + rectangle.getHeight() + " width is "
				+ rectangle.getWidth() + " and area is " + rectangle.calculateArea() + " and color is "
				+ rectangle.getColor());
		// System.out.println("Area of rectangle is "+rectangle.calculateArea());

		Rectangle rectangle2 = new Rectangle();
		rectangle2.setHeight(-34);
		rectangle2.setWidth(90);
		rectangle2.setName("rectangle2");
		rectangle2.setColor(Color.BLUE);
		rectangle2.calculateArea();
		System.out.println("Height of " + rectangle2.getName() + " is " + rectangle2.getHeight() + " width is "
				+ rectangle2.getWidth() + " and area is " + rectangle2.calculateArea() + " and color is "
				+ rectangle2.getColor());
		// System.out.println("Area of Rectangle2 is "+rectangle2.calculateArea());
	}

}
