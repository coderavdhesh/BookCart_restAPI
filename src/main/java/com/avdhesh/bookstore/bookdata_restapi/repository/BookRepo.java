package com.avdhesh.bookstore.bookdata_restapi.repository;

import com.avdhesh.bookstore.bookdata_restapi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    public Book findById(int id);
}
