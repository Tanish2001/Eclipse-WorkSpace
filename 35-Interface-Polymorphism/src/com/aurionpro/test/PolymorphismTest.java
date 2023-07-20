package com.aurionpro.test;

import com.aurionpro.model.Man;
import com.aurionpro.model.Mannerable;
import com.aurionpro.model.Boy;
import com.aurionpro.model.Emotionable;

public class PolymorphismTest {

	public static void main(String[] args) {

		Man man = new Man();
		Boy boy = new Boy();
		
		//atTheHome(man);
		atTheHome(boy);
		
		atThePark(man);
		atThePark(boy);

	}

	private static void atThePark(Mannerable obj) {
		// TODO Auto-generated method stub
		obj.depart();
		obj.wish();
		
	}

	private static void atTheHome(Emotionable obj) {
		// TODO Auto-generated method stub
		obj.cry();
		obj.laugh();
		
	}

}
