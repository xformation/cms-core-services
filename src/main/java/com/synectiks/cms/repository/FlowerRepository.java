package com.synectiks.cms.repository;


import com.synectiks.cms.model.Flower;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "flower", path = "flower")
public interface FlowerRepository extends PagingAndSortingRepository<Flower, Long> {
}
