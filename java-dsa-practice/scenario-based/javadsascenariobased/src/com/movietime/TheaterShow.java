package com.movietime;

import java.time.LocalTime;
import java.util.ArrayList;

public class TheaterShow {
	private static ArrayList<Movie> movies;
	
	private static void addMovie(String name, LocalTime time) {
		movies.add(new Movie(name, time));
		
		int j = movies.size() - 2;
		while(j >= 0 && movies.get(j).time.isAfter(movies.get(j+1).time)) {
			Movie temp = movies.get(j);
			movies.set(j, movies.get(j+1));
			movies.set(j+1, temp);
			j--;
		}
	}
	
	public static void main(String[] args) {
		movies = new ArrayList<Movie>();
		
		movies.add(new Movie("Movie 1", LocalTime.of(9, 0)));
		movies.add(new Movie("Movie 2", LocalTime.of(10, 0)));
		movies.add(new Movie("Movie 3", LocalTime.of(13, 0)));
		
		System.out.println(movies);
		addMovie("Movie 4", LocalTime.of(8, 0));
		
		System.out.println(movies);
		addMovie("Movie 5", LocalTime.of(9, 30));
		
		System.out.println(movies);
	}
}
