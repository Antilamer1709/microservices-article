package com.antilamer.microservices.controller;

import com.antilamer.microservices.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("{productId}")
    public String createOrder(@PathVariable Integer productId) {
        return ordersService.createOrder(productId);
    }

}
