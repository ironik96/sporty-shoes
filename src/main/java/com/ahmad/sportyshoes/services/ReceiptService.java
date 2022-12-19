package com.ahmad.sportyshoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmad.sportyshoes.daos.ReceiptRepository;

/**
 * ReceiptService
 */
@Service
public class ReceiptService {

    @Autowired
    ReceiptRepository repo;
}