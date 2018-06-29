package com.synectiks.cms.service;

import com.synectiks.cms.model.Book;

public interface BookService {
        Iterable<Book> listAllBooks();

    Book getBookById(Long id);

    Book saveBook(Book book);

    Book deleteBook(Long id);

    Book create(Book book);




}
