package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.IAddition;

public class AdditionTest{

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner userin = new Scanner(System.in);
//		IAddition obj1 = ()-> System.out.println(1+1);
//		obj1.add();
//		
//		IAddition obj2 = ()->{
//			int a = userin.nextInt();
//			int b = userin.nextInt();
//			System.out.println(a+b);
//		};
//		obj2.add();
		
		IAddition obj3 =  AdditionTest::subtraction;
		
		obj3.add(3,4);
	}
	
	public static void subtraction(int x , int y) {
		System.out.println(x-y);
	}

}
