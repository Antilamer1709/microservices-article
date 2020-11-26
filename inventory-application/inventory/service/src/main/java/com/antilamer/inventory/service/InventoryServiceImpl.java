package com.antilamer.inventory.service;

import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    public Boolean isProductAvailable(Integer productId) {
        if (productId < 10) {
            return true;
        } else {
            return false;
        }
    }

}
