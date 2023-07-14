package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BookCricketGame;

public class BookCricketGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookCricketGame player1= new BookCricketGame();
		BookCricketGame player2= new BookCricketGame();
		Scanner userin = new Scanner(System.in);
//		System.out.println(getRandomNumber());
		player1.setName(userin.next());
		player1.setPageNumber(1);
		player2.setName(userin.next());
		startGame(player1);
	}
	
	private static void startGame(BookCricketGame player) {
		Scanner userin = new Scanner(System.in);
		System.out.println("Player: "+player.getName());
		System.out.print("Enter 1 to open death book: ");
		int start=userin.nextInt();
		if (start==1) {
			player.setPageNumber(getRandomNumber());
			while(player.getPageNumber()!=0) {
			System.out.print("page number is "+player.getPageNumber());
			player.setPageNumber(getRandomNumber());
			}		
		}
		
	}
	
	public static int getRandomNumber() {
	    return (int) ((Math.random() * (5 - 0)) + 0);
	}
	
	

}
