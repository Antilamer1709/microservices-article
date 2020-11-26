package com.antilamer.inventory.service;

import org.springframework.stereotype.Service;

@Service("InventoryNot2Service")
public class InventoryNot2ServiceImpl implements InventoryService {

    public Boolean isProductAvailable(Integer productId) {
        return productId != 2;
    }

}
