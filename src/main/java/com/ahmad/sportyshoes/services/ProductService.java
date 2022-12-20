package com.ahmad.sportyshoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmad.sportyshoes.daos.ProductRepository;
import com.ahmad.sportyshoes.entities.Product;
import com.ahmad.sportyshoes.entities.ProductCategory;

/**
 * ProductService
 */
@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public void addProduct(Product product, String category) {
        product.setCategory(new ProductCategory(category));
        repo.save(product);
    }

    public Iterable<Product> getProducts() {
        return repo.findAll();
    }
}