package com.ufkcnkmc.crudex.controller;

import com.ufkcnkmc.crudex.entity.Book;
import com.ufkcnkmc.crudex.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/save")
    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
        Book savedBook = bookService.saveBook(book);
        return new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> allboks = bookService.getAllBooks();
        return new ResponseEntity<List<Book>>(allboks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable(name = "id") Long bookId) {
        Book book = bookService.getBookById(bookId);
        return new ResponseEntity<Book>(book, HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        Book updatedBook = bookService.updateBook(book);
        return new ResponseEntity<Book>(updatedBook,HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable(name = "id") Long bookId){
        bookService.deleteBookById(bookId);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
    @GetMapping("/search")
    public List<Book> searchBooksByQuery(@RequestParam String query) {
        return bookService.searchBooksByQuery(query);
    }


}
