package com.example.resttemplateexample.controllers;

import com.example.resttemplateexample.domain.Item;
import com.example.resttemplateexample.domain.Order;
import com.example.resttemplateexample.services.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/orders")
public class OrdersController {

    //The main idea of the below endpoints is to use @RequestParams instead of @PathVariables.

    private final OrderService orderService;

    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/byId")
    public ResponseEntity<Order> getOrderById(@RequestParam("orderId") String orderId) {

        return orderService.getOrderById(orderId);

    }

    @GetMapping("/byItemIdFromOrderId")
    public ResponseEntity<Item> getSpecificItemIdFromOrderId(
            @RequestParam("orderId") String orderId,
            @RequestParam("itemId") String itemId){

        return orderService.getItemIdFromOrderId(orderId, itemId);

    }

}
