package com.synectiks.cms.repository;

import com.synectiks.cms.model.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "author", path = "author")
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {
}
