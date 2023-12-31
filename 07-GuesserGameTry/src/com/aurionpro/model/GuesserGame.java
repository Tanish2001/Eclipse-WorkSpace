package com.aurionpro.model;

import java.lang.Math;
import java.util.Scanner;

public class GuesserGame {
	private double number = 100 * Math.random();
	private int randomNumber = (int) number;
	private int userinput;
	int count = 5;
	private boolean guessed = false;
	Scanner input = new Scanner(System.in);
	public void setUserInput(int userInput) {
		this.userinput = userInput;
		guessuserinput(userinput);
	}

	public int getUserInput() {
		return userinput;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void guessuserinput(int userinput) {
		System.out.println(getRandomNumber());
		while (count > 0) {
			if (userinput < 0 ||userinput > 100) {
				System.out.println("Enter a valid number");
				this.userinput = input.nextInt();
				guessuserinput(this.userinput);
//				game.setUserInput(userinput);
			} else if (userinput < this.randomNumber) {
				count--;
				System.out.println("The number is greater than your guess");
				this.userinput  = input.nextInt();
				guessuserinput(this.userinput);
//				game.setUserInput(userinput);
			} else if (userinput > this.randomNumber) {
				count--;
				System.out.println("The number is less than your guess");
				this.userinput  = input.nextInt();
				guessuserinput(this.userinput);
//				game.setUserInput(userinput);
			} else if (userinput == this.randomNumber) {
				System.out.println("You guessed it correctly in " + (6 - count) + " turn/s.");
				guessed = true;
				break;
			}

		}

		if (guessed == false) {
			System.out.println("You Lost");
		}
//		return void;
		askToContinue();
	}
	
    public void askToContinue() {
        System.out.println("Do you want to continue playing? (y/n)");
        String choice = input.next().toLowerCase();
        if (choice.equals("y")) {
            this.randomNumber = (int) (100 * Math.random());
            this.count = 5;
            this.guessed = false;
            System.out.println("Game Restarted");
            guessuserinput(-1);
        } 
        else {
            System.out.println("Game Ended");
        }
    }

}
