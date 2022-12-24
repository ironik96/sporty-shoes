package com.ahmad.sportyshoes.daos;

import java.sql.Date;

import org.springframework.data.repository.CrudRepository;

import com.ahmad.sportyshoes.entities.ProductCategory;
import com.ahmad.sportyshoes.entities.Receipt;
import com.ahmad.sportyshoes.entities.ReceiptItem;
import com.ahmad.sportyshoes.entities.Status;

/**
 * ReceiptItemRepository
 */
public interface ReceiptItemRepository extends CrudRepository<ReceiptItem, Integer> {

    Iterable<ReceiptItem> findByReceipt(Receipt receipt);

    Iterable<ReceiptItem> findByReceipt_DateAndReceipt_StatusAndProduct_Category(Date date, Status status,
            ProductCategory category);
}