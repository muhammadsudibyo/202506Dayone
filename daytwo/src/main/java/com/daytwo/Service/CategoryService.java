package com.daytwo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daytwo.DAO.CategoryRepository;
import com.daytwo.Model.Category;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
		
	
	public Category saveCategory(Category category) {
		
		return categoryRepository.save(category);
	}
	
	public List<Category> getAllCategory(){
		return categoryRepository.findAll();
	}
}
