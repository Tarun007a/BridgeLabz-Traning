package com.constructor.level1;

public class EBook extends Book1{
	public static void main(String[] args) {
		EBook book = new EBook();
		book.setAuthor("Authro1");
		System.out.println(book.getAuthor());
		book.ISBN = "Book12";
		book.title = "Title of book";
	}
}
