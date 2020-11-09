package com.antilamer.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

    @Autowired
    private InventoryService inventoryService;

    public String createOrder(Integer productId) {
        Boolean productAvailable = inventoryService.isProductAvailable(productId);
        if (!productAvailable) {
            return "Product with id " + productId + " is not available";
        }
        return "Order has been created!";
    }

}
