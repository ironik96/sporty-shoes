package com.ahmad.sportyshoes.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * ProductCategory
 */
@Entity
public class ProductCategory {

    @Id
    private String category;

    public ProductCategory() {
    }

    public ProductCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}