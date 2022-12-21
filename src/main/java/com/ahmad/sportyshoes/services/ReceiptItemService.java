package com.ahmad.sportyshoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmad.sportyshoes.daos.ReceiptItemRepository;
import com.ahmad.sportyshoes.entities.ReceiptItem;

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

    
}