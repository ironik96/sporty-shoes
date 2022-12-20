package com.ahmad.sportyshoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmad.sportyshoes.daos.ProductCategoryRepository;
import com.ahmad.sportyshoes.entities.ProductCategory;

/**
 * ProductCategoryService
 */
@Service
public class ProductCategoryService {

    @Autowired
    ProductCategoryRepository repo;

    public void addCategory(ProductCategory category) {
        repo.save(category);
    }

    public Iterable<ProductCategory> getCategories() {
        return repo.findAll();
    }
}