package com.avdhesh.bookstore.bookdata_restapi.services;

import java.util.List;
import com.avdhesh.bookstore.bookdata_restapi.entities.Book;
import com.avdhesh.bookstore.bookdata_restapi.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDataService {
    
    @Autowired
    BookRepo bookRepo;

    // retrive all books
    public List<Book> getBooks(){
        return bookRepo.findAll();
    }

    // retreive a spacific book by ID
    public Book getBookById(int id){
        try{
            return bookRepo.findById(id);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    // create
    public void addNewBook(Book book){
        bookRepo.save(book);
    }

    // delete 
    public void deleteBookById(int id){
        try{
            bookRepo.deleteById(id);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // Update
    public Book updateById(Book book, int id){
        book.setId(id);
        try{
            bookRepo.deleteById(id);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        bookRepo.save(book);
        return book;
    }

}
