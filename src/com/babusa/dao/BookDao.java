package com.babusa.dao;

import com.babusa.model.Book;
import java.util.List;

public interface BookDao {
	List<Book> getAllBooks();
	void saveBook(Book book);
	void deleteBook(Book book);
	Book get(int index);
}
