package com.smartlibrary;

public class Book {
	int id;
	String title;
	
	public Book(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public String toString() {
		return title;
	}
}
