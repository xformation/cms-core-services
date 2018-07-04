package com.synectiks.cms.repository;
import com.synectiks.cms.model.Company;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "company", path = "company")
public interface CompanyRepository extends PagingAndSortingRepository<Company, Integer> {
}