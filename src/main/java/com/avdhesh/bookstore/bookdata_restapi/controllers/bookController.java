package com.avdhesh.bookstore.bookdata_restapi.controllers;

import java.util.List;
import java.util.Optional;

import com.avdhesh.bookstore.bookdata_restapi.entities.Book;
import com.avdhesh.bookstore.bookdata_restapi.services.BookDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class bookController {

    @Autowired
    BookDataService bookDataService;

    @RequestMapping("/")
    public String homePage(){
        return "Welcome to the home page _ BookCART API";
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> gettingAllBooks(){
        List<Book> l = bookDataService.getBooks();

        if(l.size() == 0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(l));
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> gettingBookById(@PathVariable("id") int id){
        Book book = bookDataService.getBookById(id);

        if(book == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @PostMapping("/books/addbook")
    public ResponseEntity<Void> postingBooks(@RequestBody Book book){
        try{
            bookDataService.addNewBook(book);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Void> deletingBooks(@PathVariable("id") int id){
        try{
            bookDataService.deleteBookById(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updatingBooks(@RequestBody Book book,@PathVariable int id){
        try{
            bookDataService.updateById(book, id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    
}
