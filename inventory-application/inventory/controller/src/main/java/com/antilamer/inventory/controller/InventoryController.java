package com.antilamer.inventory.controller;

import com.antilamer.inventory.dto.InventoryDTO;
import com.antilamer.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("available/{id}")
    public Boolean isProductAvailable(@PathVariable Integer id) {
        return inventoryService.isProductAvailable(id);
    }

    @PostMapping
    public InventoryDTO createInventory(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.addToInventory(inventoryDTO);
    }

}
