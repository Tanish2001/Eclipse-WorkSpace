package com.aurionpro.test;

import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Movie;
import com.aurionpro.model.MovieController;
import com.aurionpro.model.MovieManager;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieManager man = new MovieManager();
//		man.addMovies(new Movie(1, "Endgame", 1969,"Action" ));
//		man.addMovies(new Movie(1, "Endgame", 1969,"Action" ));
//		man.addMovies(new Movie(2, "Gajni", 2001,"Action" ));
//		man.addMovies(new Movie(3, "Doraemon", 2002,"Anime" ));
//		man.addMovies(new Movie(4, "RaONE", 2005,"Action" ));
		
//		System.out.println(man.getMovies());
//		System.out.println(man.getMovieID());
//		man.clearMovies();
//		System.out.println(man.getMovies());
//		System.out.println(man.getMovieID());
		
		MovieController control = new MovieController();
		boolean stop = false;
		while(!stop ) {
			System.out.println("1. Add new Movie\n"
					+ "2. Clear All Movie\n"
					+ "3. Get all movies\n"
					+ "4. Get movie with ids\n"
					+ "5. Remove movie by id");
			Scanner userin = new Scanner(System.in);
			int userinput = userin.nextInt();
			userin.nextLine();
			if(userinput>5) {
				stop = true;
				System.out.println("Program ended.");
			}
			else {
				control.start(userinput);
			}
		}
//		control.start(5);
//		control.start(3);
	}

}
