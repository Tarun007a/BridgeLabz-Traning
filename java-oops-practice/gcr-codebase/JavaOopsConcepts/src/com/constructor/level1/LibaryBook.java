package com.constructor.level1;

public class LibaryBook {
	private String title;
	private String author;
	private int price;
	private boolean availability;
	
	// constructor
	public LibaryBook(String title, String author, int price, boolean availability) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	// function to borrow book
	public String borrowBook() {
		if(!this.availability) return "Book is not available";
		this.availability = false;
		return "Book borrowed successfully";
	}
	
	public static void main(String[] args) {
		// creating object and calling fuction
		LibaryBook book = new LibaryBook("Book1", "Author1", 100, true);
		System.out.println(book.borrowBook());
	}
}
