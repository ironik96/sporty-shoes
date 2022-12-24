package com.ahmad.sportyshoes.controllers;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ahmad.sportyshoes.entities.ProductCategory;
import com.ahmad.sportyshoes.entities.ReceiptItem;
import com.ahmad.sportyshoes.services.ReceiptItemService;

/**
 * ReceiptItemController
 */
@RestController
public class ReceiptItemController {

    @Autowired
    ReceiptItemService service;

    @PostMapping("/receipt-item")
    public void addReceiptItem(@RequestBody ReceiptItem item) {
        service.addReceiptItem(item);
    }

    @GetMapping("/receipt-items")
    public Iterable<ReceiptItem> getAllReceiptItems() {
        return service.getAllReceiptItems();
    }

    @GetMapping("/receipt-items/report")
    public Iterable<ReceiptItem> purchaseReports(@RequestParam Date date, @RequestParam String category) {
        ProductCategory pCategory = new ProductCategory(category);
        return service.getPurchaseReport(date, pCategory);
    }

}