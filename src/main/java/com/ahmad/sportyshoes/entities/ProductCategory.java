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

}