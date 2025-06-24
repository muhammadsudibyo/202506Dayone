package com.daytwo.Controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daytwo.Model.Book;
import com.daytwo.Model.Category;
import com.daytwo.Service.BookService;
import com.daytwo.Service.CategoryService;



@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private CategoryService categoryService;
	
	//add Author
	@PutMapping("/author")
	public void addAuthor() {
		
	}
	
	//add Books
	@PostMapping("/book")
	public Book addBooks(@RequestBody Book book) {
		return bookService.saveCompleteBook(book);
	}
	
	//get All Books
	@GetMapping
	public List<Book> getAllBook() {
		return bookService.getAll();
	}
	
	@GetMapping("/title")
	public Book getBookByTitle(String title) {
		return null;
	}
	
	@GetMapping("/author/{name}")
	public Book getBookByAuthorName(String authorName) {
		return null;
	}
	
	//get Category
	@GetMapping("/cat")
	public List<Category> getAllCategory() {
		return categoryService.getAllCategory();
	}
	
	
	
	
}
