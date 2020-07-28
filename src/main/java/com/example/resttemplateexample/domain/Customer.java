package com.example.resttemplateexample.domain;

public class Customer {

    public String firstname;

    public String lastname;

    public String customer_url;

    public Customer() {
    }

    public Customer(String firstname, String lastname, String customer_url) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.customer_url = customer_url;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCustomer_url() {
        return customer_url;
    }

    public void setCustomer_url(String customer_url) {
        this.customer_url = customer_url;
    }

}
