package com.synectiks.cms.repository;

import com.synectiks.cms.model.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
}
