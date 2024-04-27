package com.greatlearning.slma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.slma.entity.Book;
import com.greatlearning.slma.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/list")
	public String listBooks(Model theModel) {

		List<Book> theBooks = bookService.findAll();

		theModel.addAttribute("books", theBooks);

		return "list-books";
	}
	
    @RequestMapping("/displayBookForm")
    public String addBook_Step1(Model theModel) {

        Book book = new Book();

        theModel.addAttribute("book", book);

        return "book-form";
    }  
	
    
    @PostMapping("/save")
    public String saveBook(
    	@RequestParam("id") int id, 
    	@RequestParam("name") String name,
        @RequestParam("category") String category, 
        @RequestParam("author") String author) {

      System.out.println("Book ID ->" + id);

      Book bookObj = null;
      if (id == 0) {

        bookObj = new Book(name, category, author);
        System.out.println("Add Book Scenario");
      } else {

    	    bookObj=bookService.findById(id);
    	    bookObj.setName(name);
    	    bookObj.setCategory(category);
    	    bookObj.setAuthor(author);    
    	  
        System.out.println("Update Book Scenario");
      }

      // Save/Update the book
      bookService.save(bookObj);

      // use a redirect to 'books-listing'
      return "redirect:/books/list";
    }    
    
    
    @RequestMapping("/displayBookForm_Update")
    public String updateBook_Step1(
        @RequestParam("bookId") int bookId,
            Model theModel) {

        Book book = bookService.findById(bookId);

        // set Book as a model attribute to pre-populate the form
        theModel.addAttribute("book", book);

        // send over to our form
        return "book-form";   
    }  
    
    
    @RequestMapping("/delete")
    public String delete(@RequestParam("bookId") int bookId) {

        // delete the Book
        bookService.deleteById(bookId);

        // redirect to 'books-listing'
        return "redirect:/books/list";
    }  

    @RequestMapping("/search")
    public String search(
    	@RequestParam("name") String name,
    	@RequestParam("author") String author,
    	Model theModel
    	) {
    
    	
    	if (name.trim().isEmpty() && author.trim().isEmpty()) {

            // redirect to 'books-listing'
            return "redirect:/books/list";    		
    	}else {
    		
    		List<Book> books 
    			= bookService.searchBy(name, author);
    	
    		theModel.addAttribute("books", books);

    		return "list-books";
    		
    	}
    	
    }
}
