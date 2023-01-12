package com.avdhesh.bookstore.bookdata_restapi.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books_data")
public class Book implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_Id")
    int id;
    
    @Column(name = "book_name")
    String book_name;
    @Column(name = "discription")
    String discription;
    @Column(name = "author")
    String author;
    @Column(name = "isAvailable")
    boolean isAvailable;

    public Book() {
    }
    
    public Book(int id, String book_name, String discription, String author, boolean isAvailable) {
        this.id = id;
        this.book_name = book_name;
        this.discription = discription;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBook_name() {
        return book_name;
    }
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    public String getDiscription() {
        return discription;
    }
    public void setDiscription(String discription) {
        this.discription = discription;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
}
