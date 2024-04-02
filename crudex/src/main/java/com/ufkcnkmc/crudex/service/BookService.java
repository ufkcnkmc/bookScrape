package com.ufkcnkmc.crudex.service;

import com.ufkcnkmc.crudex.entity.Book;
import com.ufkcnkmc.crudex.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired//enjeksiyon vb için
    BookRepository bookRepository;

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(Long bookId){
        return bookRepository.findById(bookId).get();
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBookById(Long bookId){//bos döndürecek
        bookRepository.deleteById(bookId);
    }





}
