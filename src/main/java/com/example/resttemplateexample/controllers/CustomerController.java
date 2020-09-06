package com.example.resttemplateexample.controllers;

import com.example.resttemplateexample.domain.Customer;
import com.example.resttemplateexample.request.CustomerRequest;
import com.example.resttemplateexample.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomers();

    }

    @GetMapping("/{id}")
    public Customer getCustomerByIdUsingPathVariable(
            @PathVariable("id") String id) {

        return customerService.getCustomerById(id);

    }

    @PostMapping
    public Customer createCustomer(@RequestBody CustomerRequest customerRequest) {

        Customer createdCustomer = customerService.createCustomer(customerRequest);
        return createdCustomer;

    }

    @PutMapping
    @RequestMapping("/{id}")
    public void updateCustomer(@RequestBody CustomerRequest customerRequest, @PathVariable("id") String id) {

        customerService.updateCustomer(id, customerRequest);

    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") String id) {

        customerService.deleteCustomer(id);

    }

}
