package com.antilamer.inventory.service;

import com.antilamer.inventory.dto.InventoryDTO;

public interface InventoryService {

    InventoryDTO addToInventory(InventoryDTO inventoryDTO);

    Boolean isProductAvailable(Integer productId);

}
