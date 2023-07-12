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
		System.out.println(game.getUserInput() +" "+ game.getRandomNumber());
		
		while(count>0) {
			if(game.getUserInput()<0 || game.getUserInput()>100) {
				System.out.println("Enter a valid number");
				userinput = input.nextInt();
				game.setUserInput(userinput);
			}
			else if(game.getUserInput()<game.getRandomNumber()) {
				System.out.println("The number is greater than your guess");
				userinput = input.nextInt();
				game.setUserInput(userinput);
				count--;
			}
			else if(game.getUserInput()>game.getRandomNumber()) {
				System.out.println("The number is less than your guess");
				userinput = input.nextInt();
				game.setUserInput(userinput);
				count--;
			}
			else if(game.getUserInput()==game.getRandomNumber()) {
				System.out.println("You guessed it correctly in "+(6-count)+" turn/s.");
				guessed = true;
				break;
			}
			
		}
		
		if (guessed==false) {
			System.out.println("You Lost");
		}
	}

}
