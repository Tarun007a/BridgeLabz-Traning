package com.objectmodeling.level1;
import java.util.ArrayList;

public class Libary {
	// storing list of books
	public ArrayList<LibaryBook> books;
	
	// using varargs to take add in list
	public Libary(LibaryBook... curr) {
		books = new ArrayList<LibaryBook>();
		for(LibaryBook book : curr) books.add(book);
	}
}
