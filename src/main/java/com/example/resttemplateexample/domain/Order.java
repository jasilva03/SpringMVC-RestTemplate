package com.example.resttemplateexample.domain;

import java.sql.Timestamp;

public class Order {

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String state;
    private String customer_url;
    private String items_url;

    public Order() {
    }

    public Order(Timestamp createdAt, Timestamp updatedAt, String state, String customer_url, String items_url) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.state = state;
        this.customer_url = customer_url;
        this.items_url = items_url;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCustomer_url() {
        return customer_url;
    }

    public void setCustomer_url(String customer_url) {
        this.customer_url = customer_url;
    }

    public String getItems_url() {
        return items_url;
    }

    public void setItems_url(String items_url) {
        this.items_url = items_url;
    }

}
