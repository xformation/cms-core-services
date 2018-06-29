package com.synectiks.cms.controller;

import com.synectiks.cms.model.Book;
import com.synectiks.cms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/book"})
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book create(@RequestBody Book book){
        return bookService.create(book);
    }

    @GetMapping(path = {"/{id}"})
    public Book findOne(@PathVariable("id") long id){
        return bookService.getBookById(id);
    }

    @PutMapping
    public Book update(@RequestBody Book user){
        return bookService.saveBook(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public Book delete(@PathVariable("id") long id) {
        return bookService.deleteBook(id);
    }

    @GetMapping
    public Iterable<Book> findAll(){
        return bookService.listAllBooks();
    }

}
