package com.daytwo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daytwo.Model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
