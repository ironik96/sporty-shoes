package com.ahmad.sportyshoes.daos;

import org.springframework.data.repository.CrudRepository;

import com.ahmad.sportyshoes.entities.Receipt;
import com.ahmad.sportyshoes.entities.Status;
import com.ahmad.sportyshoes.entities.User;

/**
 * ReceiptRepository
 */
public interface ReceiptRepository extends CrudRepository<Receipt, Integer> {

    boolean existsByUserAndStatus(User userEmail, Status status);

    Receipt findByUserAndStatus(User userEmail, Status status);
}