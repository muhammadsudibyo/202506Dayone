package com.daytwo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daytwo.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
