package com.babusa.app;

import com.babusa.model.Book;
import com.babusa.dao.BookDao;
import com.babusa.daoImpl.BookDaoImpl;


public class BookStore {
	public static void main(String[] args) {
		BookDao bookDaoImpl  = new BookDaoImpl();
		for(Book book: bookDaoImpl.getAllBooks()) {
			System.out.println(book.getName());
		}
		
		Book newBook = new Book("The Crab with the Golden Claws", 1940);
		bookDaoImpl.saveBook(newBook);
		
		System.out.println("---");
		
		for(Book book: bookDaoImpl.getAllBooks()) {
			System.out.println(book.getName());
		}
		
		bookDaoImpl.deleteBook(bookDaoImpl.get(1));
		bookDaoImpl.deleteBook(bookDaoImpl.get(3));
		
		System.out.println("---");
		
		for(Book book: bookDaoImpl.getAllBooks()) {
			System.out.println(book.getName());
		}
	}
}
