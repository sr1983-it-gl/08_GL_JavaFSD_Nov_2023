package com.greatlearning.lma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.lma.entity.Book;
import com.greatlearning.lma.service.BookService;

@Controller
public class BookController {

//	@RequestMapping("/list")

	@Autowired
	BookService bookService;
	
	@RequestMapping("/books/list")
	public String showAllBooks() {
		
		List<Book> books = bookService.listBooks();
		
		return "";
	}
}
