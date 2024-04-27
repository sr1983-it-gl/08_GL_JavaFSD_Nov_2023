package com.greatlearning.slma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.slma.entity.Book;
import com.greatlearning.slma.repository.BookRepository;
import com.greatlearning.slma.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> findAll() {
		List<Book> books = bookRepository.findAll();
		return books;
	}

	  @Override
	  public void save(Book book) {
	      bookRepository.save(book);                    
	  } 
	
	  @Override
	  public Book findById(int bookId) {
	      return bookRepository.findById(bookId).get();
	  }  

	  @Override
	  public void deleteById(int id) {
	      bookRepository.deleteById(id);    
	  }  

	  @Override
	  public List<Book> searchBy(String name, String author){
		  
		  return 
		  bookRepository.findByNameContainsAndAuthorContainsAllIgnoreCase(
				 name, author);
	  }
	  
}
