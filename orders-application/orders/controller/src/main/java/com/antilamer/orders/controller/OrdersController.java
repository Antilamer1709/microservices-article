package com.antilamer.orders.controller;

import com.antilamer.orders.dto.OrderDTO;
import com.antilamer.orders.service.OrdersService;
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
    public OrderDTO createOrder(@RequestBody OrderDTO orderDTO) {
        return ordersService.createOrder(orderDTO);
    }

}
