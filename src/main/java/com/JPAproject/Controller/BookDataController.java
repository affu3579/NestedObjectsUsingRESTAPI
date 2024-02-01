package com.JPAproject.Controller;



import com.JPAproject.Entity.BookDataEntity;
import com.JPAproject.Service.BookDataService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class BookDataController {
     @Autowired
	public BookDataService bookDataService;
	
	@PostMapping("/addBooks")
	public BookDataEntity addBooks(@RequestBody BookDataEntity entity) {
		//TODO: process POST request
		
	BookDataEntity book=this.bookDataService.addBooks(entity);
	return book;
	}
	
	@GetMapping("/getBooks")
	public List<BookDataEntity> getBooks() {
		return this.bookDataService.getBooks();
		
	}
	@GetMapping("/getBooks/{id}")
	public Optional<BookDataEntity> getBookByID(@PathVariable int id) {
		return this.bookDataService.getBookByID(id);
		
	}
	
	
	
	
}
