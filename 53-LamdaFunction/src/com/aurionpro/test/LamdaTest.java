package com.aurionpro.test;

import com.aurionpro.model.IGreeatable;
import com.aurionpro.model.LamdaModel;

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamdaModel obj = new LamdaModel();
		obj.welcome();
		
		IGreeatable obj2 = new IGreeatable() {
			
			@Override
			public void welcome() {
				// TODO Auto-generated method stub
				System.out.println("GoodBye");
			}
		};
		
		obj2.welcome();
	}

}
