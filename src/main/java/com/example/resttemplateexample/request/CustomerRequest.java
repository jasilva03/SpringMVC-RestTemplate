package com.example.resttemplateexample.request;

public class CustomerRequest {

    public String firstname;

    public String lastname;

    public CustomerRequest() {
    }

    public CustomerRequest(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
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

}
