package com.aurionpro.test;

import com.aurionpro.model.Table;

public class TableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t1 = new Table(5);
		t1.start();
		
		
		long i =0L;
		while(i<1000000000000000000L) {
			i++;
		}
		long j = 0L;
		while(j<1000000000000000000L) {
			j++;
		}
		
		
		t1.setNumber(10);
		Thread t2 = new Thread(t1);
		t2.start();
//		Table t2 = new Table(0);
//		t2.start();
	}

}
