package com.synectiks.cms.repository;

import com.synectiks.cms.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}