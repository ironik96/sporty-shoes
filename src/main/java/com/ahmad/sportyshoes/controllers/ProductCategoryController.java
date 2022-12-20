package com.ahmad.sportyshoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahmad.sportyshoes.entities.ProductCategory;
import com.ahmad.sportyshoes.services.ProductCategoryService;

/**
 * ProductCategoryController
 */
@RestController
public class ProductCategoryController {

    @Autowired
    ProductCategoryService service;

    @PostMapping("/category")
    public void addCategory(@RequestBody ProductCategory category) {
        service.addCategory(category);
    }

    @GetMapping("/categories")
    public Iterable<ProductCategory> getCategories() {
        return service.getCategories();
    }

}