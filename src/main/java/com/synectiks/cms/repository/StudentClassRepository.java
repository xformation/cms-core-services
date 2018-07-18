package com.synectiks.cms.repository;

import com.synectiks.cms.model.StudentClass;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "studentClass", path = "studentClass")
public interface StudentClassRepository extends PagingAndSortingRepository<StudentClass, Long>  {
}
