package com.babusa.daoImpl;
import java.util.List;
import java.util.ArrayList;

import com.babusa.dao.BookDao;
import com.babusa.model.Book;

public class BookDaoImpl implements BookDao {

	List<Book> books = new ArrayList<Book>();
	public BookDaoImpl () {
		books.add(new Book("Tintin in the Land of the Soviets", 1930));
		books.add(new Book("Cigars of the Pharaoh", 1934));
		books.add(new Book("The Broken Ear", 1937));
		books.add(new Book("King Ottokar's Sceptre", 1939));
	}
	@Override
	public List<Book> getAllBooks() {
		return books;
	}

	@Override
	public void saveBook(Book book) {
		books.add(book);
	}

	@Override
	public void deleteBook(Book book) {
		books.remove(book);
	}
	
	@Override
	public Book get(int index) {
		return books.get(index);
	}

}
