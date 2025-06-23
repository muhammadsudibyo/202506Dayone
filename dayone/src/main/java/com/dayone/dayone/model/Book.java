package com.dayone.dayone.model;

import javax.validation.constraints.NotBlank;


public class Book {
	private Long id;
	
	@NotBlank( message = "harus ada title")
	private String title;
	
	@NotBlank( message = "harus ada author")
	private String author;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(Long id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	
}
