package com.ahmad.sportyshoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahmad.sportyshoes.entities.Product;
import com.ahmad.sportyshoes.entities.ProductCategory;
import com.ahmad.sportyshoes.services.ProductService;

/**
 * ProductController
 */
@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/product/{category}")
    public void addProduct(@RequestBody Product product, @PathVariable String category) {
        product.setCategory(new ProductCategory(category));
        service.addProduct(product);
    }

    @GetMapping("/products")
    public Iterable<Product> getProducts() {
        return service.getProducts();
    }

}