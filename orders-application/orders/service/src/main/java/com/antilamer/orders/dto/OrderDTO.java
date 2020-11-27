package com.antilamer.orders.dto;

import com.antilamer.orders.domain.OrderEntity;

public class OrderDTO {

    private Integer id;
    private Integer inventoryId;
    private String name;

    public OrderDTO() {
    }

    public OrderDTO(OrderEntity orderEntity) {
        this.id = orderEntity.getId();
        this.inventoryId = orderEntity.getInventory().getId();
        this.name = orderEntity.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
