package com.ahmad.sportyshoes.daos;

import org.springframework.data.repository.CrudRepository;

import com.ahmad.sportyshoes.entities.ProductCategory;

/**
 * ProductCategoryRepository
 */
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {

    
}