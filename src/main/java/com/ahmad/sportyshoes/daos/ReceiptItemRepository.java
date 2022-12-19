package com.ahmad.sportyshoes.daos;

import org.springframework.data.repository.CrudRepository;

import com.ahmad.sportyshoes.entities.ReceiptItem;

/**
 * ReceiptItemRepository
 */
public interface ReceiptItemRepository extends CrudRepository<ReceiptItem, Integer> {

    
}