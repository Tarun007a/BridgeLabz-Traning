package com.movietime;

import java.time.LocalTime;

public class Movie {
	String name;
	LocalTime time;
	
	public Movie(String name, LocalTime time) {
		this.time = time;
		this.name = name;
	}
	
	public String toString() {
		return name + " " + time;
	}
}
