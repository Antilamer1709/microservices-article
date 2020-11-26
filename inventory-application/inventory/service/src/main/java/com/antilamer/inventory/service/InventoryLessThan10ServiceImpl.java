package com.antilamer.inventory.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class InventoryLessThan10ServiceImpl implements InventoryService {

    public Boolean isProductAvailable(Integer productId) {
        if (productId < 10) {
            return true;
        } else {
            return false;
        }
    }

}
