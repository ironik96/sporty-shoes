package com.ahmad.sportyshoes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * ReceiptItem
 */
@Entity
public class ReceiptItem {

    @Id
    @GeneratedValue
    private int id;
    private int qty;
    @ManyToOne
    private Receipt receipt;
    @ManyToOne
    private Product product;

}