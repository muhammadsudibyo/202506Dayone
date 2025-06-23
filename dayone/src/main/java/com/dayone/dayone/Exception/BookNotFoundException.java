package com.dayone.dayone.Exception;

public class BookNotFoundException extends RuntimeException{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 public BookNotFoundException(Long id) {
	        super("Book not found with id: " + id);
	    }

	    public BookNotFoundException(String title) {
	        super("Book not found with title: " + title);
	    }
}
