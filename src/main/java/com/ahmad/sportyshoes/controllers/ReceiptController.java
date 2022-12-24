package com.ahmad.sportyshoes.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahmad.sportyshoes.entities.Receipt;
import com.ahmad.sportyshoes.services.ReceiptItemService;
import com.ahmad.sportyshoes.services.ReceiptService;
import com.ahmad.sportyshoes.services.UserService;

/**
 * ReceiptController
 */
@RestController
public class ReceiptController {

    @Autowired
    ReceiptService service;
    @Autowired
    UserService userService;
    @Autowired
    ReceiptItemService receiptItemService;

    @GetMapping("/receipt/{userEmail}")
    public Receipt getUserReceipt(@PathVariable String userEmail) {
        var user = userService.getUserByEmail(userEmail);
        if (user.isPresent())
            return service.getUserReceipt(user.get());
        return null;
    }

    @GetMapping("/receipts/{userEmail}")
    public Iterable<Receipt> getUserReceipts(@PathVariable String userEmail) {
        var user = userService.getUserByEmail(userEmail);
        if (user.isPresent())
            return service.getUserReceipts(user.get());
        return null;
    }

    @GetMapping("/receipts")
    public Iterable<Receipt> getAllReceipts() {
        return service.getAllReceipts();
    }

    @PostMapping("/receipt/{receiptId}")
    public Map<String, Object> checkout(@PathVariable int receiptId) {
        var receipt = service.getReceipt(receiptId);
        if (receipt.isEmpty())
            return null;
        service.checkout(receipt.get());
        var fullReceipt = new HashMap<String, Object>();
        fullReceipt.put("receipt", receipt.get());
        fullReceipt.put("items", receiptItemService.getReceiptItems(receipt.get()));
        return fullReceipt;

    }

}