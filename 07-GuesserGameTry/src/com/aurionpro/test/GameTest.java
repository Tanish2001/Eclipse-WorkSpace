package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.model.GuesserGame;

public class GameTest {

	public static void main(String[] args) {
		int count=5;
		Boolean guessed = false;
		GuesserGame game = new GuesserGame();
		System.out.println("Guess the number");
		Scanner input = new Scanner(System.in);
		int userinput = input.nextInt();
		game.setUserInput(userinput);
		System.out.println( game.getRandomNumber());
		

	}

}
