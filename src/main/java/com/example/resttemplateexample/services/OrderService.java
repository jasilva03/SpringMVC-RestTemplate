package com.example.resttemplateexample.services;

import com.example.resttemplateexample.domain.Item;
import com.example.resttemplateexample.domain.Order;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface OrderService {

    ResponseEntity<Order> getOrderById(String orderId);

    ResponseEntity<Item> getItemIdFromOrderId(String orderId, String itemId);

}
