package com.aurionpro.test;

import com.aurionpro.model.ClassifyPlayers;
import com.aurionpro.model.Players;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players[] player = {
				new ClassifyPlayers(1, "Ved", 200, 6000, 200),
				new ClassifyPlayers(2, "dang", 49, 2500, 65),
				new ClassifyPlayers(3, "asis", 90, 6000, 200),
				new ClassifyPlayers(4, "ban", 10, 6000, 200),
				new ClassifyPlayers(5, "tan", 20, 6000, 200),
				new ClassifyPlayers(6, "can", 300, 6000, 200),
				new ClassifyPlayers(7, "van", 300, 6000, 76)

				
		};
		//System.out.println("A Rank Players");
//		ClassifyPlayers.getAListers(player);
		
		//System.out.println("B Rank Players");
//		ClassifyPlayers.getBListers(player);
		
		//System.out.println("C Rank Players");
//		ClassifyPlayers.getCListers(player);
		//System.out.println("==============================");
		Players aList[] = 		ClassifyPlayers.getAListers(player);
		ClassifyPlayers.getAListers(player);

		Players bList[] = 		ClassifyPlayers.getBListers(player);
		ClassifyPlayers.getBListers(player);
		
		Players cList[] = 		ClassifyPlayers.getCListers(player);
		ClassifyPlayers.getCListers(player);



		for (int i = 0; i < aList.length; i++) {
			System.out.println(aList[i]);
		}
		System.out.println("=====================================");
		for (int i = 0; i < bList.length; i++) {
			System.out.println(bList[i]);
		}
		System.out.println("=====================================");
		for (int i = 0; i < cList.length; i++) {
			System.out.println(cList[i]);
		}
	}

}
