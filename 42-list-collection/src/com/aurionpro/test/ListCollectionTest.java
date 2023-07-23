package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = new ArrayList<Integer>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(50);
		number.add(90);
		
		System.out.println(number.size());
		System.out.println(number);
		number.remove(0);
		System.out.println(number);
		System.out.println(number.contains(90));
		System.out.println(number);
		number.clear();
		System.out.println(number);

	}

}
