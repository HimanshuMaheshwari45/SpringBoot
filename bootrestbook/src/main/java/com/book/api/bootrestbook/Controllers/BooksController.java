package com.book.api.bootrestbook.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.book.api.bootrestbook.Entities.Book;
import com.book.api.bootrestbook.Services.BookService;

@RestController
public class BooksController {

  @Autowired
  private BookService bookService;

  @GetMapping("/books")
  public List<Book> getBooks(){
    return this.bookService.getAllBooks();
  }

  @GetMapping("/books/{id}")
  public Book getBook(@PathVariable("id") int id){
    return bookService.getBookById(id);
  }
  
}
