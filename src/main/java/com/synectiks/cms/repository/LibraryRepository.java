package com.synectiks.cms.repository;

import com.synectiks.cms.model.Library;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "library", path = "library")
public interface LibraryRepository extends PagingAndSortingRepository<Library, Long> {
}
