package com.ahmad.sportyshoes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ahmad.sportyshoes.entities.User;
import com.ahmad.sportyshoes.services.UserService;

/**
 * UserController
 */
@RestController
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return service.getUsers();
    }

    @PostMapping("/users/register")
    public void register(@RequestBody User user) {
        service.register(user);
    }

    @GetMapping("/users/search")
    public List<User> searchUsers(@RequestParam("query") String query) {
        return service.searchUsers(query);
    }

}