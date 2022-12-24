package com.ahmad.sportyshoes.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

/**
 * ReceiptItem
 */
@Entity
@IdClass(ReceiptItemCompositeKey.class)
public class ReceiptItem {

    private int qty;
    @Id
    @ManyToOne
    private Receipt receipt;
    @Id
    @ManyToOne
    private Product product;

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
        return "ReceiptItem [qty=" + qty + ", receipt=" + receipt + ", product=" + product + "]";
    }

}

/**
 * ReceiptItemCompositeKey
 */
class ReceiptItemCompositeKey implements Serializable {
    private Receipt receipt;
    private Product product;

    public ReceiptItemCompositeKey() {
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Integer receiptId) {
        this.receipt = new Receipt(receiptId);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Integer productId) {
        this.product = new Product(productId);
    }

}