package com.ahmad.sportyshoes.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ahmad.sportyshoes.entities.User;

/**
 * UserRepository
 */
public interface UserRepository extends CrudRepository<User, String> {

    List<User> findByfName(String fName);

    List<User> findBylName(String lName);

}