package com.antilamer.inventory.repository;

import com.antilamer.inventory.domain.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {

}