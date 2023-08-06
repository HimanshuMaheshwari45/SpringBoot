package com.book.api.bootrestbook.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.api.bootrestbook.Entities.Book;
import com.book.api.bootrestbook.dao.BookRepository;

@Component
public class BookService {
  
  // private static List<Book> list = new ArrayList<>();
  // static{
  //   list.add(new Book(12, "Learning java", "Himanshu"));
  //   list.add(new Book(13, "Learning JavaScript", "TechGun") );
  //   list.add(new Book(14, "Learning DSA", "Kunal kushwaha"));
  //   list.add(new Book(15, "Learning React", "React.org"));
  // }

    @Autowired
    private BookRepository bookRepository;


//Get all books
  public List<Book> getAllBooks(){

   List<Book> list = (List<Book>) this.bookRepository.findAll();
    return list;
  }
 
// get single book by id
  public Book getBookById(int id){
   Book book = null;
   
   try {
    // book = list.stream().filter(e-> e.getId()==id).findFirst().get();
    book= this.bookRepository.findById(id);

   } catch (Exception e) {
      e.printStackTrace();
   }
    return book;
  }

  //Add a book
  public Book addBook(Book book){
    Book result = this.bookRepository.save(book);
    return result;
  }

  public void deleteBook(int id) {

    // list = list.stream().filter(book-> book.getId()!=id).collect(Collectors.toList());
    this.bookRepository.deleteById(id);

  }

  // Update the Book
  public void updateBook(Book book, int id) {
    
    // list.stream().map(b -> {
    //   if(b.getId()==id){
    //     b.setTitle(book.getTitle());
    //     b.setAuthor(book.getAuthor());
    //   }
    //   return b;
    // }).collect(Collectors.toList());
    book.setId(id);
    this.bookRepository.save(book);

  }

}
