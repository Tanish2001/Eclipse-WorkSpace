package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Man;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		case1();
		case2();
		case3();
		case4();


	}

	private static void case4() {
		// TODO Auto-generated method stub
		Object obj;
		obj = 10;
		System.out.println(obj.getClass().getSimpleName());
		
	
		obj = "BanTan";
		System.out.println(obj.getClass().getSimpleName());
		
		obj = 10>20;
		System.out.println(obj.getClass().getSimpleName());

		
	}

	private static void case3() {
		
	}

	private static void case2() {
		Man man = new Boy();
		man.play();
		man.read();
		man.work();
	}

	//man object
	private static void case1() {
		Man man = new Man();
		man.play();
		man.read();
		
	}

}
