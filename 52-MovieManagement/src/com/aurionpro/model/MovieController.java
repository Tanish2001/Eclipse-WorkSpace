package com.aurionpro.model;

import java.util.Scanner;

public class MovieController {
	MovieManager manager;
	
	public MovieController() {
		manager = new MovieManager();
		// TODO Auto-generated constructor stub
	}
	
	public void start(int UserInput) {
		Scanner userin = new Scanner(System.in);
		switch (UserInput) {
		case 1:
			System.out.println("Enter movie ID");
			int movieID = userin.nextInt();
			userin.nextLine();
			
			System.out.println("Enter movie name");
			String movieName = userin.nextLine();
//			userin.nextLine();
			
			System.out.println("Enter movie year");
			int movieYear = userin.nextInt();
			userin.nextLine();
			
			System.out.println("Enter movie genre");
			String movieGenre = userin.nextLine();
			manager.addMovies(new Movie(movieID, movieName, movieYear, movieGenre));
			break;
		
		case 2:
			manager.clearMovies();
			break;

		
		case 3:
			System.out.println(manager.getMovies());
			break;

		
		case 4:
			manager.getMovieID();
			break;

		
		case 5:
			System.out.println("Enter movie id to remove: ");
			int ID = userin.nextInt();
			manager.deleteMovieByID(ID);
			break;

			
//		case 6:
//			manager.
		default:
			System.out.println("Invalid parameter");
			break;
		}
	}
}

