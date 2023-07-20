package com.aurionpro.test;

import java.lang.reflect.Field;
import java.lang.reflect.*;

import com.aurionpro.model.Dog;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog(19, "Cyno");
		System.out.println("Fields");
		Field[] field = myDog.getClass().getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			System.out.println(field[i].getName());
		}
		System.out.println("==============================");
		Class Dog = myDog.getClass();
		System.out.println("Class Name: ");
		System.out.println(Dog.getSimpleName());
		System.out.println("==============================");
		System.out.println("Methods");
		Method[] method = Dog.getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i].getName());
		}
		System.out.println("==============================");
		System.out.println(myDog.getName());
		System.out.println(myDog.getPLACE_NAME());
		System.out.println("==============================");

		for (int i = 0; i < field.length; i++) {
			if(field[i].getName().equals("name")) {
				try {
					field[i].setAccessible(true);
					field[i].set(myDog, "Dio");
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		for (int i = 0; i < field.length; i++) {
			if(field[i].getName().equals("PLACE_NAME")) {
				try {
					field[i].setAccessible(true);
					field[i].set(myDog, "Antartica");
					System.out.println(myDog.getPLACE_NAME());
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			else {
				//System.out.println("NA");
			}
		}
		System.out.println(myDog.getName());
		
		Constructor[] declaredCons = myDog.getClass().getDeclaredConstructors();
		for(Constructor c :declaredCons) {
			System.out.println(c);
		}
	}

}
