package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MovieManager {
	List<Movie> movies;
	static final String filepath = "D:\\Codes\\Eclipse-Wrokspace\\52-MovieManagement\\data.bin";

	public MovieManager() {
		movies = new ArrayList<Movie>();
		checkfile();
		loadMovies();
	}

	private void checkfile() {
		BufferedReader reader;
		// TODO Auto-generated method stub
		try {
			reader = new BufferedReader(new FileReader("D:\\\\Codes\\\\Eclipse-Wrokspace\\\\52-MovieManagement\\\\data.bin"));
			String line = reader.readLine();
			if(line==null) {
				saveMovies();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed");
		}
		
	}

	private void loadMovies() {
		try {

			FileInputStream file = new FileInputStream(filepath);
			ObjectInputStream in = new ObjectInputStream(file);

			movies = (List<Movie>) in.readObject();

			in.close();
			file.close();
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}

	private void saveMovies() {
		// TODO Auto-generated method stub
		try {
			FileOutputStream file = new FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(movies);
			out.close();
			file.close();

//	            System.out.println("Object has been serialized");
			loadMovies();

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}
	}

	public void addMovies(Movie movie) {
		movies.add(movie);
		saveMovies();
//		movies.add(null);

	}

	public void clearMovies() {
		movies.clear();
		saveMovies();
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public Map<Integer, String> getMovieID() {
//		List<Integer> temp = new ArrayList<Integer>();
		Map<Integer, String> temp = new HashMap<Integer, String>();
		for (int i = 0; i < movies.size(); i++) {
			temp.put(movies.get(i).getId(), movies.get(i).getName());
		}
		return temp;
	}

	public void deleteMovieByID(int id) {
		for (int i = 0; i < movies.size(); i++) {
			if (movies.get(i).getId() == id) {
				movies.remove(i);
				saveMovies();
			}
		}
	}
}
