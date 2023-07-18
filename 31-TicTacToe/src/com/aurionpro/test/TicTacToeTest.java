package com.aurionpro.test;

import java.util.Scanner;

public class TicTacToeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] grid = new String[3][3];
		System.out.println("Game Begins");
		Scanner userin = new Scanner(System.in);

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = "-";
			}
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

//		System.out.println("Player1");
		boolean gameEnded = false;
		boolean boardfull = false;
		int turnFlag = 1;
		while (!gameEnded && boardfull(grid)==false) {
			if (turnFlag == 1) {
				System.out.println("Player1 turn: ");
				System.out.println("i: ");
				int iRow = userin.nextInt();
				System.out.println("j: ");
				int jColoumn = userin.nextInt();
				updategrid(iRow, jColoumn, turnFlag, grid);
				printGrid(grid);
				turnFlag = 2;
				if (checkwinner(grid)==true) {
					gameEnded = true;
					System.out.println("Game over, player 1 won");
				}
				
			}
			if (turnFlag == 2 && boardfull(grid)==false && gameEnded==false) {
				System.out.println("Player2 turn: ");
				System.out.println("i: ");
				int iRow = userin.nextInt();
				System.out.println("j: ");
				int jColoumn = userin.nextInt();
				updategrid(iRow, jColoumn, turnFlag, grid);
				printGrid(grid);
				turnFlag = 1;
				if (checkwinner(grid)) {
					gameEnded = true;
					System.out.println("Game over, player2 won");
				}
				boardfull(grid);

			}
		}

	}

	private static String[][] updategrid(int row, int coloumn, int turnFlag, String[][] grid) {
		Scanner userin = new Scanner(System.in);
		if (row >= 3 && row < 0 && coloumn >= 3 && coloumn < 0 && !grid[row][coloumn].equals("-")) {
			System.out.println("Out of bounds/already filled, enter again.");
			System.out.println("i: ");
			int iRow = userin.nextInt();
			System.out.println("j: ");
			int jColoumn = userin.nextInt();
			updategrid(iRow, jColoumn, turnFlag, grid);
		} else {
			if (turnFlag == 1) {
				grid[row][coloumn] = "x";
			} else {
				grid[row][coloumn] = "o";
			}
		}
		return grid;
	}

	private static boolean checkwinner(String[][] grid) {
		
		for (int i = 0; i < grid.length; i++) {
            if (grid[i][0].equals(grid[i][1]) && grid[i][1].equals(grid[i][2]) && !grid[i][0].equals("-")) {
                return true;
            }
            if (grid[0][i].equals(grid[1][i]) && grid[1][i].equals(grid[2][i]) && !grid[0][i].equals("-")) {
                return true;
            }
        }
        if (grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2]) && !grid[0][0].equals("-")) {
            return true;
        }
        if (grid[2][0].equals(grid[1][1]) && grid[2][0].equals(grid[0][2]) && !grid[2][0].equals("-")) {
            return true;
        }
        return false;
	}

	public static boolean boardfull(String[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] == "-") {
					return false;
				}
			}
		}
		return true;
	}

	public static void printGrid(String[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

}
