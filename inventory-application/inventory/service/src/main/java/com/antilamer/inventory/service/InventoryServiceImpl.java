package com.antilamer.inventory.service;

import com.antilamer.inventory.domain.InventoryEntity;
import com.antilamer.inventory.dto.InventoryDTO;
import com.antilamer.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;


    @Override
    public Boolean isProductAvailable(Integer productId) {
        return inventoryRepository.findById(productId).isPresent();
    }

    @Override
    public InventoryDTO addToInventory(InventoryDTO inventoryDTO) {
        InventoryEntity inventoryEntity = new InventoryEntity();
        inventoryEntity.setAmount(inventoryDTO.getAmount());
        inventoryEntity.setName(inventoryDTO.getName());

        inventoryRepository.save(inventoryEntity);
        return new InventoryDTO(inventoryEntity);
    }
}
