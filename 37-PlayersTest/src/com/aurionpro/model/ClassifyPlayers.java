package com.aurionpro.model;

public class ClassifyPlayers extends Players {
	public ClassifyPlayers(int id, String name, int matches, int runs, int iwckets) {
		super(id, name, matches, runs, iwckets);
		// TODO Auto-generated constructor stub
	}


	public static Players[] getAListers(Players[] player) {
		int count=0;
		for (int i = 0; i < player.length; i++) {
	
			if (player[i].getMatches() > 100 && (player[i].getRuns() > 5000 || player[i].getIwckets() > 150)) {
//				System.out.println(player[i]);
				count++;
			}
		}
		Players arr[] = new Players[count];
		for (int i=0,j = 0; i < player.length; i++) {
			if (player[i].getMatches() > 100 && (player[i].getRuns() > 5000 || player[i].getIwckets() > 150)) {
				arr[j] = player[i];
				count++;
				j++;
			}
		}
		return arr;
	}

	public static Players[] getBListers(Players[] player) {
		for (int i = 0; i < player.length; i++) {
			if (player[i].getMatches() > 50 && ((player[i].getRuns() > 3000 && player[i].getRuns() < 5000)
					|| (player[i].getIwckets() > 75 && player[i].getIwckets() < 150))) {
//				System.out.println(player[i]);
			}
		}
		int count=0;
		for (int i = 0; i < player.length; i++) {
	
			if (player[i].getMatches() > 50 && ((player[i].getRuns() > 3000 && player[i].getRuns() < 5000)
					|| (player[i].getIwckets() > 75 && player[i].getIwckets() < 150))) {
//				System.out.println(player[i]);
				count++;
			}
		}
		Players arr[] = new Players[count];
		for (int i=0,j = 0; i < player.length; i++) {
			if (player[i].getMatches() > 50 && ((player[i].getRuns() > 3000 && player[i].getRuns() < 5000)
					|| (player[i].getIwckets() > 75 && player[i].getIwckets() < 150))) {
				arr[j] = player[i];
				count++;
				j++;
			}
		}
		return arr;
		
	}

	public static Players[] getCListers(Players[] player) {
		for (int i = 0; i < player.length; i++) {
			if (player[i].getMatches() < 50 && (player[i].getRuns() < 3000 || player[i].getIwckets() < 75)) {
//				System.out.println(player[i]);
			}
		}
		int count=0;
		for (int i = 0; i < player.length; i++) {
	
			if (player[i].getMatches() < 50 && (player[i].getRuns() < 3000 || player[i].getIwckets() < 75)) {
//				System.out.println(player[i]);
				count++;
			}
		}
		Players arr[] = new Players[count];
		for (int i=0,j = 0; i < player.length; i++) {
			if (player[i].getMatches() < 50 && (player[i].getRuns() < 3000 || player[i].getIwckets() < 75)) {
				arr[j] = player[i];
				count++;
				j++;
			}
		}
		return arr;
		
	}
}
