package com.objectmodeling.level1;
import java.util.ArrayList;

public class Libary {
	public ArrayList<LibaryBook> books;
	
	public Libary(LibaryBook... curr) {
		books = new ArrayList<LibaryBook>();
		for(LibaryBook book : curr) books.add(book);
	}
}
