package com.synectiks.cms.repository;

import com.synectiks.cms.model.Attendance;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "attendance", path = "attendance")
public interface AttendanceRepository extends PagingAndSortingRepository<Attendance, Long> {
}
