package com.artexpo;

import java.time.LocalTime;

public class Artist {
	String name;
	LocalTime time;
	
	public Artist(String name, LocalTime time) {
		super();
		this.name = name;
		this.time = time;
	}
	
	public String toString() {
		return this.name +  " " + time; 
	}
}
