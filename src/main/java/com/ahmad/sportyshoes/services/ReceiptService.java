package com.ahmad.sportyshoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmad.sportyshoes.daos.ReceiptRepository;
import com.ahmad.sportyshoes.entities.Receipt;
import com.ahmad.sportyshoes.entities.Status;
import com.ahmad.sportyshoes.entities.User;

/**
 * ReceiptService
 */
@Service
public class ReceiptService {

    @Autowired
    ReceiptRepository repo;

    public Receipt getUserReceipt(User user) {
        if (repo.existsByUserAndStatus(user, Status.ongoing))
            return repo.findByUserAndStatus(user, Status.ongoing);
        var receipt = new Receipt();
        receipt.setUser(user);
        repo.save(receipt);
        return receipt;
    }

    public Iterable<Receipt> getAllReceipts() {
        return repo.findAll();
    }

    public void checkout(Receipt receipt) {
        if (receipt.getStatus() == Status.completed)
            return;

        receipt.setStatus(Status.completed);
        repo.save(receipt);
    }

    public Receipt getReceipt(int receiptId) {
        return repo.findById(receiptId).get();
    }
}