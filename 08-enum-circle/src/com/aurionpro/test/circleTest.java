package com.aurionpro.test;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Color;
import com.aurionpro.model.circle;

public class circleTest {

	public static void main(String[] args) {
		circle circle1 = new circle();
		circle1.setRadius(32.2);
		circle1.setBorderType(BorderType.Solid);
		circle1.setColor(Color.Blue);
		System.out.println("Area is "+circle1.CalculateArea()+" perimeter is "+circle1.CalculatePeri()+" and color is "+ circle1.getColor()+" with bordertype "+ circle1.getBorder());
	}

}
