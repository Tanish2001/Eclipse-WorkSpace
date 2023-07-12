package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		System.out.println("Enter height, width and color");
		Scanner userin = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(userin.nextDouble());
		rectangle.setWidth(userin.nextDouble());
		rectangle.setName("rectangle1");
		try {
		rectangle.setColor(Color.valueOf(userin.next().toUpperCase()));}
		catch(Exception e) {
			rectangle.setColor(Color.RED);
		}
		rectangle.calculateArea();
		System.out.println("Height of " + rectangle.getName() + " is " + rectangle.getHeight() + " width is "
				+ rectangle.getWidth() + " and area is " + rectangle.calculateArea() + " and color is "
				+ rectangle.getColor());
		// System.out.println("Area of rectangle is "+rectangle.calculateArea());
		
		System.out.println("Enter height, width and color");
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setHeight(userin.nextInt());
		rectangle1.setWidth(userin.nextInt());
		rectangle1.setName("rectangle1");
		try {
		rectangle1.setColor(Color.valueOf(userin.next().toUpperCase()));}
		catch(Exception e) {
			rectangle1.setColor(Color.RED);
		}
		rectangle1.calculateArea();
		System.out.println("Height of " + rectangle1.getName() + " is " + rectangle1.getHeight() + " width is "
				+ rectangle1.getWidth() + " and area is " + rectangle1.calculateArea() + " and color is "
				+ rectangle1.getColor());

	}
	
	public static void setrectangle(Rectangle rectangle) {
		
	}

}
