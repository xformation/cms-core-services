package com.synectiks.cms.repository;

import com.synectiks.cms.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
