package com.antilamer.orders.dto;

import com.antilamer.orders.domain.OrderEntity;

public class OrderDTO {

    private Integer id;
    private Integer productId;
    private String name;

    public OrderDTO() {
    }

    public OrderDTO(OrderEntity orderEntity) {
        this.id = orderEntity.getId();
        this.productId = orderEntity.getProductId();
        this.name = orderEntity.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
