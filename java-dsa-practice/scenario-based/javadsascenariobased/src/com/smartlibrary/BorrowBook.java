package com.smartlibrary;

import java.util.ArrayList;

public class BorrowBook {
	public static void issueBook(int id, String title, ArrayList<Book> books) {
		books.add(new Book(id, title));
		
		int j = books.size() - 2;
		while(j >= 0 && books.get(j).title.compareTo(books.get(j+1).title) > 0) {
			Book temp = books.get(j);
			books.set(j, books.get(j+1));
			books.set(j+1, temp);
			j--;
		}
	}
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		
		books.add(new Book(1, "Title 1"));
		books.add(new Book(2, "Title 4"));
		books.add(new Book(3, "Title 7"));
		
		issueBook(4, "Title 3", books);
		System.out.println(books);
		
		issueBook(5, "Title 2", books);
		System.out.println(books);
	}
}
