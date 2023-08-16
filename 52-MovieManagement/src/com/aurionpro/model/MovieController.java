package com.aurionpro.model;

import java.util.DuplicateFormatFlagsException;
import java.util.Iterator;
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
			try {
				System.out.println("Enter movie ID");
				int movieID = userin.nextInt();
				userin.nextLine();
				for(int i = 0; i<manager.getMovies().size();i++) {
					if(manager.getMovies().get(i).getId()==movieID) {
						System.out.println("Movie with same id already exsist.");
						throw new DuplicateFormatFlagsException("This id already exsist");
					}
				}
				
				System.out.println("Enter movie name");
				String movieName = userin.nextLine();
				for(int i = 0; i<manager.getMovies().size();i++) {
					if(manager.getMovies().get(i).getName().equalsIgnoreCase(movieName)) {
						System.out.println("Movie with same name already exsist.");
						throw new DuplicateFormatFlagsException("This movie name already exsist");
					}
				}
//				userin.nextLine();
				
				System.out.println("Enter movie year");
				int movieYear = userin.nextInt();
				userin.nextLine();
				
				System.out.println("Enter movie genre");
				String movieGenre = userin.nextLine();
				manager.addMovies(new Movie(movieID, movieName, movieYear, movieGenre));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			break;
		
		case 2:
			manager.clearMovies();
			break;

		
		case 3:
//			System.out.println(manager.getMovies());
			for (Movie x : manager.getMovies()) {
				System.out.println(x);
			}
			break;

		
		case 4:
			System.out.println("Enter movie id");
			System.out.println(manager.getMovieID());
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

