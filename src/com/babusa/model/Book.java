package com.babusa.model;

public class Book {
	String name;
	long isbn;

	public Book (String name, long isbn) {
		this.name = name;
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	
}
