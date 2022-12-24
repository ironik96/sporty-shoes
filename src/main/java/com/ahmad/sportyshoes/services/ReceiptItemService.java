package com.ahmad.sportyshoes.services;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmad.sportyshoes.daos.ReceiptItemRepository;
import com.ahmad.sportyshoes.entities.ProductCategory;
import com.ahmad.sportyshoes.entities.Receipt;
import com.ahmad.sportyshoes.entities.ReceiptItem;
import com.ahmad.sportyshoes.entities.Status;

/**
 * ReceiptItemService
 */
@Service
public class ReceiptItemService {

    @Autowired
    ReceiptItemRepository repo;

    public void addReceiptItem(ReceiptItem item) {
        repo.save(item);
    }

    public Iterable<ReceiptItem> getAllReceiptItems() {
        return repo.findAll();
    }

    public Iterable<ReceiptItem> getReceiptItems(Receipt receipt) {
        return repo.findByReceipt(receipt);
    }

    public Iterable<ReceiptItem> getPurchaseReport(Date date, ProductCategory category) {
        return repo.findByReceipt_DateAndReceipt_StatusAndProduct_Category(date, Status.completed, category);
    }

}