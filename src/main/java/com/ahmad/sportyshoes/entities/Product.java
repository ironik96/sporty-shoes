package com.ahmad.sportyshoes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Product
 */
@Entity
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private double price;
    @ManyToOne
    private ProductCategory category;

}