package com.ahmad.sportyshoes.daos;

import org.springframework.data.repository.CrudRepository;

import com.ahmad.sportyshoes.entities.Receipt;

/**
 * ReceiptRepository
 */
public interface ReceiptRepository extends CrudRepository<Receipt, Integer> {

    
}