package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.AppModel;
import com.aurionpro.model.Rectangle;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppModel<Integer> obj1= new AppModel<Integer>(5);
		obj1.printValue();
		
		AppModel<Float> obj2= new AppModel<Float>(5.5F);
		obj2.printValue();
		
		Rectangle rect1=new Rectangle(3, 3);
		AppModel<Rectangle> obj3 = new AppModel<Rectangle>(rect1);
		obj3.printValue();
		
		printValues(10,"adwdxa");
		printValues(12.23323, 89333);
		
		List<Integer> intList = Arrays.asList(1,2,4,6,43,334);
		List<Double> doubList = Arrays.asList(2.2,2.3,2.0,4.34);
		printList(intList);
		printList(doubList);
		
	}
	
	private static void printList(List<?> intList) {
		for (Object t : intList) {
			System.out.println(t);
		}
		
	}

//	private static<T> void printList(List<T> intList) {
//		for (T t : intList) {
//			System.out.println(t);
//		}
//		
//	}

	private static <T,S> void printValues(T value1, S value2) {
		// TODO Auto-generated method stub
		System.out.println(value1 +" "+ value2);
		
	}

}
