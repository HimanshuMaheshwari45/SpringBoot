package com.book.api.bootrestbook.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.book.api.bootrestbook.Entities.Book;

@Component
public class BookService {
  
  private static List<Book> list = new ArrayList<>();
  static{
    list.add(new Book(12, "Learning java", "Himanshu"));
    list.add(new Book(13, "Learning JavaScript", "TechGun") );
    list.add(new Book(14, "Learning DSA", "Kunal kushwaha"));
    list.add(new Book(15, "Learning React", "React.org"));
  }


//Get all books
  public List<Book> getAllBooks(){

    return list;
  }
 
// get single book by id
  public Book getBookById(int id){
    return list.stream().filter(e-> e.getId()==id).findFirst().get();
  }


}
