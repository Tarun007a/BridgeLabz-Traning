package com.cinemahouse;

public class Movie {
	String name;
	int time;
	
	public Movie(String name, int time) {
		this.name = name;
		this.time = time;
	}
	
	public String toString() {
		return name + " " + time;
	}
}
