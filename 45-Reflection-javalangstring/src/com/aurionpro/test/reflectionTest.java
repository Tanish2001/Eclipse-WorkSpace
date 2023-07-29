package com.aurionpro.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String store = args[0];
		try {
			Class<?> temp = Class.forName(store);
			
			System.out.println("Your Input is: "+temp.getName());
			System.out.println();
			Method[] methods = temp.getDeclaredMethods();
			System.out.println("Method names for given class are as follows: ");
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i].getName());
			}
			System.out.println("-------------------------------------------------");
			System.out.println("-------------------------------------------------");

			Field[] fields = temp.getDeclaredFields();
			System.out.println("Fields names for given class are as follows: ");
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i].getName());
			}
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
