package com.cinemahouse;

import java.util.Arrays;

public class TimeSorting {
	private static void sort(Movie[] movies) {
		 int n = movies.length;
		 
		 for(int i = 0; i < n-1; i++) {
			 for(int j = 0; j < n-i-1; j++) {
				 if(movies[j].time > movies[j+1].time) {
					 Movie temp = movies[j];
					 movies[j] = movies[j+1];
					 movies[j+1] = temp;
				 }
			 }
		 }
	}
	public static void main(String[] args) {
		Movie[] movies = {
				new Movie("Movie 1", 150), 
				new Movie("Movie 2", 170), 
				new Movie("Movie 3", 140), 
				new Movie("Movie 4", 200), 
				new Movie("Movie 5", 180)
		};
		sort(movies);
		System.out.println(Arrays.toString(movies));
	}
}
