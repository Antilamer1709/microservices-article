package com.antilamer.microservices.service;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    public Boolean isProductAvailable(Integer productId) {
        if (productId < 10) {
            return true;
        } else {
            return false;
        }
    }

}
