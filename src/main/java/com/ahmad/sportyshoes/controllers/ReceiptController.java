package com.ahmad.sportyshoes.controllers;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahmad.sportyshoes.entities.Receipt;
import com.ahmad.sportyshoes.entities.User;
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

    @GetMapping("/receipt/{userEmail}")
    public Receipt getUserReceipt(@PathVariable String userEmail) {
        var user = userService.getUserByEmail(userEmail);
        if (user.isPresent())
            return service.getUserReceipt(user.get());
        return null;
    }

    @GetMapping("/receipts")
    public Iterable<Receipt> getAllReceipts() {
        return service.getAllReceipts();
    }

    @PostMapping("/receipt/{receiptId}")
    public void checkout(@PathVariable int receiptId) {
        var receipt = service.getReceipt(receiptId);
        if (receipt.isPresent())
            service.checkout(receipt.get());
    }

}