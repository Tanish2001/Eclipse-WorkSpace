package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LineItem> list = new ArrayList<LineItem>();
		list.add(new LineItem(1,"Surf",3,50));
		list.add(new LineItem(2,"soup",3,50));
		list.add(new LineItem(3,"mari",3,50));
		list.add(new LineItem(4,"gold",3,50));

		
		System.out.println("Total Cost Of line is "+LineItem.calculateTotalPriceofLine(list));
	}
	
}
