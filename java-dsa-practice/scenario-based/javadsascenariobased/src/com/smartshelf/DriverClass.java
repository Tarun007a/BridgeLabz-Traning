package com.smartshelf;

import java.util.Arrays;

public class DriverClass {
	private static void sort(Book[] books) {
		int n = books.length;
		
		for(int i = 1; i < n; i++) {
			int j = i-1;
			while(j >= 0 && books[j].title.compareTo(books[j+1].title) == 1) {
				Book temp = books[j];
				books[j] = books[j+1];
				books[j+1] = temp;
			}
		}
	}
	public static void main(String[] args) {
		Book[] books = {
				new Book("book 2"),
				new Book("book 1"),
				new Book("book 4"),
				new Book("book 3"),
				new Book("book 5"),
		};
		sort(books);
		System.out.println(Arrays.toString(books));
	}
}
