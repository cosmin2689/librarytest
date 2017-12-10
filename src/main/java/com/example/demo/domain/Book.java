package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Cosmin on 12/9/2017.
 */
@Entity
public class Book extends AbstractDomainClass {

    private String author;
    private String title;

    @ManyToOne
    private Customer customer;

    private boolean isBooked;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
