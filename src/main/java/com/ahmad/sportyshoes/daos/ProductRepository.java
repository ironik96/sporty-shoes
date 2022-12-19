package com.ahmad.sportyshoes.daos;

import org.springframework.data.repository.CrudRepository;

import com.ahmad.sportyshoes.entities.Product;

/**
 * ProductRepository
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

    
}