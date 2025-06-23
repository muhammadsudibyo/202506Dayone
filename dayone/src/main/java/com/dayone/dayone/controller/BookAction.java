package com.dayone.dayone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dayone.dayone.model.Book;
import com.dayone.dayone.service.BookService;

@RestController
@RequestMapping("/api/book")
public class BookAction {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping
	public List<Book> getBookAll() {
		return bookService.getBookAll();
	}
	
	@GetMapping("/{id}")
	public Book getBookById(Long id) {
		return bookService.getBookDetailById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteBookById(Long id) {
		bookService.deleteBookById(id);
		return "Buku dengan ID " + id + " berhasil dihapus.";
	}
	
	@PostMapping
	public Book addBook(Book book) {
		return bookService.addNewBook(book);
	}
	
}
