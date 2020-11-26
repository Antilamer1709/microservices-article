package com.antilamer.orders.repository;

import com.antilamer.orders.domain.OrderEntity;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public OrderEntity save(OrderEntity order) {
        // saving order
        return order;
    }

    public OrderEntity findById(Integer orderId) {
        return new OrderEntity(orderId, "Order" + orderId);
    }

}
