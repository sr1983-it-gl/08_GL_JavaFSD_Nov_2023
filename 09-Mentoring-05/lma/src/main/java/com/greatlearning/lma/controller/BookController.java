package com.greatlearning.lma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.lma.entity.Book;
import com.greatlearning.lma.service.BookService;

@Controller
public class BookController {

//	@RequestMapping("/list")

	@Autowired
	BookService bookService;
	
//	@RequestMapping("/books/list")
	@RequestMapping(value = "/books/list", method = RequestMethod.GET)	
	public String showAllBooks(Model model) {
		
		List<Book> books = bookService.listBooks();
		
		model.addAttribute("books", books);
		
		return "books/list-books";
	}
	
	
	@RequestMapping("/books/bookFormDisplay")
	public String saveBook_Step1(Model model) {
		
		Book defaultBookObj = new Book();
//		defaultBookObj.setTitle("TITLE-1");
//		defaultBookObj.setAuthor("AUTHOR-1");
//		defaultBookObj.setCategory("CATEGORY-1");
		
		
		model.addAttribute("book", defaultBookObj);
		
		return "books/book-form";
	}
	

//	@PostMapping(value = "/books/save")
	@RequestMapping(value = "/books/save", 
			method = RequestMethod.POST)
	public String saveBook_Step2(
		@ModelAttribute("book") Book book) {
				
		// SAVE - INSERT
		// UPDATE - UPDATE
		
		bookService.save(book);
				
		return "redirect:/books/list";
	}
	
	@RequestMapping("/books/bookFormDisplayUpdate")
	public String updateBook_Step1(
		@RequestParam("bookId") Integer bookId,
		Model model) {
		
		// Use bookID --> book
		
		Book bookObj = bookService.findByID(bookId);		
		
		model.addAttribute("book", bookObj);
		
		return "books/book-form";
	}
	
	
	@RequestMapping("/books/delete")
	public String deleteBook(
		@RequestParam("bookId") Integer bookId) {
		
		bookService.deleteByID(bookId);		
		
		return "redirect:/books/list";
	}	
	
}
