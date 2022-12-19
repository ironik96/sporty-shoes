package com.ahmad.sportyshoes.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * ReceiptItem
 */
@Entity
public class Receipt {

    @Id
    @GeneratedValue
    private int id;
    private Date date;

}