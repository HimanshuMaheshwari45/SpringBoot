package com.book.api.bootrestbook.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.api.bootrestbook.Entities.Book;

@RestController
public class BooksController {

  @GetMapping("/books")
  public Book getBooks(){

    Book book =  new Book();
    book.setId(12);
    book.setTitle("Learn SpringBoot from Code with Durgesh");
    book.setAuthor("Himanshu Maheshwari");

    System.out.println("This is to test the controller on web page");
    return book;
     
  }

  
}
