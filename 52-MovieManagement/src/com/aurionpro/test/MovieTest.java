package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Movie;
import com.aurionpro.model.MovieController;
import com.aurionpro.model.MovieManager;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieManager man = new MovieManager();
		man.addMovies(new Movie(1, "Endgame", 1969,"Action" ));
		man.addMovies(new Movie(1, "Endgame", 1969,"Action" ));
		man.addMovies(new Movie(2, "Gajni", 2001,"Action" ));
		man.addMovies(new Movie(3, "Doraemon", 2002,"Anime" ));
		man.addMovies(new Movie(4, "RaONE", 2005,"Action" ));
		
		System.out.println(man.getMovies());
//		System.out.println(man.getMovieID());
//		man.clearMovies();
//		System.out.println(man.getMovies());
//		System.out.println(man.getMovieID());
		
//		MovieController control = new MovieController();
//		control.start(1);
//		control.start(5);
//		control.start(3);
	}

}
