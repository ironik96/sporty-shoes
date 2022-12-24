package com.ahmad.sportyshoes.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * ReceiptItem
 */
@Entity
public class Receipt {

    @Id
    @GeneratedValue
    private int id;
    private Date date = Date.valueOf(LocalDate.now());
    @Enumerated(EnumType.STRING)
    private Status status = Status.ongoing;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    public Receipt() {
    }

    public Receipt(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}