package com.constructor.level1;

public class Book {
	private String title;
	private String author;
	private int price;
	
	// Parameterized constructor
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// default constructor
	public Book() {
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("Book title", "Author name", 100);
	}
}
