package com.aurionpro.test;

import com.aurionpro.model.Distance;

public class DistanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance[] distance = {
				new Distance(6, 10),
				new Distance(6, 1000),

		};
		
		Distance d1 = new Distance(6, 10);
		Distance d2 = new Distance(6, 1000);
		Distance d3 = d1.addDistance(d2);
//		System.out.println(sum(distance));
		System.out.println(d3);
	}
	
	private static Distance sum(Distance[] distances) {
		int incheOverflow =0;
		int feetSum = distances[0].getFeet()+distances[1].getFeet();
		int incheSum = distances[0].getInches()+distances[1].getInches();
		while (incheSum>12) {
			incheSum-=12;
			incheOverflow+=1;
		}
		feetSum+=incheOverflow;
		Distance updatedDistance = new Distance(feetSum, incheSum);
		return updatedDistance;
	}

}
