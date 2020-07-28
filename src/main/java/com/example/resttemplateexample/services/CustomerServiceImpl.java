package com.example.resttemplateexample.services;

import com.example.resttemplateexample.domain.Customer;
import com.example.resttemplateexample.domain.Customers;
import com.example.resttemplateexample.request.CustomerRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    RestTemplate restTemplate;

    public CustomerServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Customer> getAllCustomers() {

        Customers customers = restTemplate.getForObject("https://api.predic8.de:443/shop/customers/", Customers.class);
        return customers.getCustomers();

    }

    @Override
    public Customer getCustomerById(String id) {

        Customer customer = restTemplate.getForObject("https://api.predic8.de:443/shop/customers/" + id, Customer.class);
        return customer;

    }

    @Override
    public Customer createCustomer(CustomerRequest customerRequest) {

        Customer createdCustomer = restTemplate.postForObject("https://api.predic8.de:443/shop/customers/", customerRequest, Customer.class);
        return createdCustomer;

    }

    @Override
    public void updateCustomer(String id, CustomerRequest customerRequest) {

        restTemplate.put("https://api.predic8.de:443/shop/customers/" + id, customerRequest);

    }

    @Override
    public void deleteCustomer(String id) {

        restTemplate.delete("https://api.predic8.de:443/shop/customers/" + id);

    }

}
