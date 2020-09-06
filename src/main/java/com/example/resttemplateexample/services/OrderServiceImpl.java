package com.example.resttemplateexample.services;

import com.example.resttemplateexample.domain.Item;
import com.example.resttemplateexample.domain.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Value("${external.api.fruit.shop.orders}")
    private String externalAPI;

    private final RestTemplate restTemplate;

    public OrderServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ResponseEntity<Order> getOrderById(String orderId) {

        //This is done this way just because I wanted to test the usage of sending a map.

        String uri = externalAPI + "{id}";

        Map<String, String> hmValues = new HashMap<>();
        hmValues.put("id", orderId);

        ResponseEntity<Order> response = restTemplate.getForEntity(uri, Order.class, hmValues);

        return response;

    }

    @Override
    public ResponseEntity<Item> getItemIdFromOrderId(String orderId, String itemId) {

        //This is done this way just because I wanted to test the usage of sending varargs.

        String uri = externalAPI + "{orderId}/items/{itemId}";

        ResponseEntity<Item> response = restTemplate.getForEntity(uri, Item.class, orderId, itemId);

        return response;

    }

}
