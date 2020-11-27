package com.antilamer.orders.service;

import com.antilamer.inventory.service.InventoryService;
import com.antilamer.orders.domain.OrderEntity;
import com.antilamer.orders.dto.OrderDTO;
import com.antilamer.orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private InventoryService inventoryService;

    @Override
    public OrderDTO getOrder(Integer orderId) {
        OrderEntity orderEntity = orderRepository
                .findById(orderId)
                .orElseThrow(() -> new RuntimeException("There is no such order in the DB"));
        return new OrderDTO(orderEntity);
    }

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        Boolean productAvailable = inventoryService.isProductAvailable(orderDTO.getInventoryId());
        if (!productAvailable) {
            throw new RuntimeException("Product with inventoryId " + orderDTO.getInventoryId() + " is not available");
        }
        OrderEntity orderEntity = orderRepository.save(new OrderEntity(orderDTO.getInventoryId(), orderDTO.getName()));
        return new OrderDTO(orderEntity);
    }

}
