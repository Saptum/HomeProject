package com.example.homeproject.service;

import com.example.homeproject.model.Book;
import com.example.homeproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> saveBooks(List<Book> bookList){
        return bookRepository.saveAll(bookList);
    }

    public List<Book> findAllBooks(List<Book> bookList){
        return bookRepository.findAll();
    }




}
