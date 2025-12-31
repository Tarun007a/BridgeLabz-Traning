package com.objectmodeling.level1;

public class LibaryBook {
	private String title;
	private String author;

	// constructor
    public LibaryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getter and setter for private attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
