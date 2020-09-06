package com.example.resttemplateexample.services;

import com.example.resttemplateexample.domain.Customer;
import com.example.resttemplateexample.domain.Customers;
import com.example.resttemplateexample.request.CustomerRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    RestTemplate restTemplate;

    @Value("${external.api.fruit.shop.customers}")
    private String externalAPI;

    public CustomerServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Customer> getAllCustomers() {

        Customers customers = restTemplate.getForObject(externalAPI, Customers.class);
        return customers.getCustomers();

    }

    @Override
    public Customer getCustomerById(String id) {

        Customer customer = restTemplate.getForObject(externalAPI + id, Customer.class);
        return customer;

    }

    @Override
    public Customer createCustomer(CustomerRequest customerRequest) {

        Customer createdCustomer = restTemplate.postForObject(externalAPI, customerRequest, Customer.class);
        return createdCustomer;

    }

    @Override
    public void updateCustomer(String id, CustomerRequest customerRequest) {

        restTemplate.put(externalAPI + id, customerRequest);

    }

    @Override
    public void deleteCustomer(String id) {

        restTemplate.delete(externalAPI + id);

    }

}
