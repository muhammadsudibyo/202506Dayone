package com.daytwo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daytwo.DAO.BookRepository;
import com.daytwo.Model.Book;
import com.daytwo.Model.Category;

import jakarta.transaction.Transactional;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repo;
	@Autowired
	private CategoryService categoryService;
	

	public List<Book> getAll(){
		return repo.findAll();
	
	}
	
	public Book saveBook(Book book) {
		return repo.save(book);
	} 
	
	public Book getByBookId(long id) {
		return repo.getById(id);
	}
	
	public void delete(Long id) {
		Book book = new Book();
		book.setIds(id);
		repo.delete(book);
	}
	
	@Transactional
	public Book saveCompleteBook(Book book) {
		System.out.println("mulai save kategory : "+ book.getCategory().toString());
		
		Category category = new Category();
		category.setName(book.getCategory().getName());
		category.setDescription(book.getCategory().getDescription());
		
		category = categoryService.saveCategory(category);
		System.err.println("beres save kategory");
		
		//untuk nge break transaksional
		if (book.getTitle().equalsIgnoreCase("415"))
			throw new NullPointerException("return value is null at method AAA");
		
		book.setCategory(category);
		
		System.err.println("mulai save Buku");
		saveBook(book);
		System.err.println("beres save buku");
		
		
		return book;
	}
	 
}
