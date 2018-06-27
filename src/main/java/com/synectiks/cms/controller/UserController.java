package com.synectiks.cms.controller;

import com.synectiks.cms.model.User;
import com.synectiks.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/user"})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") long id){
        return userService.getUserById(id);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") long id) {
        return userService.deleteUser(id);
    }

    @GetMapping
    public Iterable<User> findAll(){
        return userService.listAllUsers();
    }
}