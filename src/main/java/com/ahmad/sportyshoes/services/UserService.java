package com.ahmad.sportyshoes.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
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

    public Optional<User> getUserByEmail(String email) {
        return repo.findById(email);
    }

    public Iterable<User> getUsers() {
        return repo.findAll();
    }

    public void register(User user) {
        repo.save(user);
    }

    public List<User> searchUsers(String query) {
        Set<User> results = new HashSet<User>();

        var user = getUserByEmail(query);
        if (user.isPresent())
            results.add(user.get());
        results.addAll(repo.findByfName(query));
        results.addAll(repo.findBylName(query));

        return new ArrayList<User>(results);
    }
}