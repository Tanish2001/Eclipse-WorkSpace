package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest {
	
	
	public static void main(String[] args) {
//		Rectangle[] rectangles = new Rectangle[2]; 
//		for (int i=0;i<2;i++) {
//			rectangles[i]= new Rectangle();
//			setRectangle(rectangles[i]);
//		}
		Rectangle rect1 = new Rectangle(60,60,Color.BLUE);
		setRectangle(rect1);
		Rectangle rect2 = new Rectangle();
		setRectangle(rect2);

	}
	
	private static void setRectangle(Rectangle rectangle) {
		System.out.println("Enter height, width and color");
		//Scanner userin = new Scanner(System.in);
		//rectangle.setHeight(userin.nextInt());
		//rectangle.setWidth(userin.nextInt());
		//rectangle.setName("rectangle1");
//		try {
//		rectangle.setColor(Color.valueOf(userin.next().toUpperCase()));
//		}
//		catch(Exception e) {
//			rectangle.setColor(Color.RED);
//		}
		rectangle.calculateArea();
		System.out.println("Height of " + rectangle.getName() + " is " + rectangle.getHeight() + " width is "
				+ rectangle.getWidth() + " and area is " + rectangle.calculateArea() + " and color is "
				+ rectangle.getColor());
	}
	
}
