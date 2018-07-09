package com.synectiks.cms.repository;

import com.synectiks.cms.model.Colour;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "colour", path = "colour")
public interface ColourRepository extends PagingAndSortingRepository<Colour, Long> {
}
