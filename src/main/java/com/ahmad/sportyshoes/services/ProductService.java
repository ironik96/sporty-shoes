package com.ahmad.sportyshoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmad.sportyshoes.daos.ProductRepository;

/**
 * ProductService
 */
@Service
public class ProductService {

    @Autowired
    ProductRepository repo;
}