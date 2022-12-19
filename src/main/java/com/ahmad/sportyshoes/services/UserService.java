package com.ahmad.sportyshoes.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmad.sportyshoes.daos.UserRepository;
import com.ahmad.sportyshoes.entities.User;

/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public Iterable<User> getUsers() {
        return repo.findAll();
    }

    public void register(User user) {
        repo.save(user);
    }

    public List<User> searchUsers(String query) {
        Set<User> results = new HashSet<User>();

        results.addAll(repo.findByEmail(query));
        results.addAll(repo.findByfName(query));
        results.addAll(repo.findBylName(query));

        return new ArrayList<User>(results);
    }
}