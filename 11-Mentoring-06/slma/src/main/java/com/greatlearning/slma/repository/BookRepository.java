package com.greatlearning.slma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.slma.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	// CRUD
	
	List<Book>
	findByNameContainsAndAuthorContainsAllIgnoreCase(String name, String author);
}
