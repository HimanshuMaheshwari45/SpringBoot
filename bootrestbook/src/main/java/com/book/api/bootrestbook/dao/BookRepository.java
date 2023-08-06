package com.book.api.bootrestbook.dao;

import org.springframework.data.repository.CrudRepository;

import com.book.api.bootrestbook.Entities.Book;

public interface BookRepository extends CrudRepository<Book ,Integer>{
  
  public Book findById(int id);




}