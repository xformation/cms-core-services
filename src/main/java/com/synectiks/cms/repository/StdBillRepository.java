package com.synectiks.cms.repository;

import com.synectiks.cms.model.StdBill;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "stdBill", path = "stdBill")
public interface StdBillRepository extends PagingAndSortingRepository<StdBill, Long> {

}
