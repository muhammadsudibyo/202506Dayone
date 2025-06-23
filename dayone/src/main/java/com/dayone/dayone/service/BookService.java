package com.dayone.dayone.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dayone.dayone.Exception.BookNotFoundException;
import com.dayone.dayone.model.Book;

@Service
public class BookService {
	private List<Book> listBook = new ArrayList<>();
	private Long curId = 1L;
	
	public List<Book> getBookAll(){
		return listBook;
	}
	
	public Book addNewBook(Book book) {
		book.setId(curId++);
		listBook.add(book);
		return book;
	}
	
	public void deleteBookById(Long id) {
		Book book = getBookDetailById(id);
		listBook.remove(book);
		
	}
	
	public Book getBookDetailById(Long id) {
		return listBook.stream().filter(book -> book.getId().equals(id))
				.findFirst()
				.orElseThrow(() -> new BookNotFoundException(id));
	}
	
	
}
