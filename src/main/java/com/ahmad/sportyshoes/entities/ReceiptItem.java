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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ReceiptItem() {
    }

    public ReceiptItem(int productId, int qty, Receipt receipt) {
        this.qty = qty;
        this.receipt = receipt;
        this.product = new Product(productId);
    }

    @Override
    public String toString() {
        return "ReceiptItem [id=" + id + ", qty=" + qty + ", receipt=" + receipt + ", product=" + product + "]";
    }

    

}