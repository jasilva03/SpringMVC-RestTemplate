package com.example.resttemplateexample.services;

import com.example.resttemplateexample.domain.Customer;
import com.example.resttemplateexample.request.CustomerRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerById(String id);

    Customer createCustomer(CustomerRequest customerRequest);

    void updateCustomer(String id, CustomerRequest customerRequest);

    void deleteCustomer(String id);

}
