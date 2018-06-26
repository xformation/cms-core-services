package com.synectiks.cms.service;

import com.synectiks.cms.model.User;

public interface UserService {

    Iterable<User> listAllUsers();

    User getUserById(Long id);

    User saveUser(User user);

    User deleteUser(Long id);

    User create(User user);

}