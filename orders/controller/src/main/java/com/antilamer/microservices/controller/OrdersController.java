package com.antilamer.microservices.controller;

import com.antilamer.microservices.dto.OrderDTO;
import com.antilamer.microservices.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("{orderId}")
    public OrderDTO getOrder(@PathVariable Integer orderId) {
        return ordersService.getOrder(orderId);
    }

    @PostMapping
    public String createOrder(@RequestBody OrderDTO orderDTO) {
        return ordersService.createOrder(orderDTO);
    }

}
