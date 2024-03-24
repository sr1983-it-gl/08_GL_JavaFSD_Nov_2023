package com.greatlearning.lma.service;

import java.util.List;

import com.greatlearning.lma.entity.Book;

public interface BookService {

	List<Book>	listBooks();
	
	void save(Book book);
	
	Book findByID(Integer bookId);

	void deleteByID(Integer bookID);
	
}
