package com.antilamer.orders.service;

import com.antilamer.inventory.domain.InventoryEntity;
import com.antilamer.inventory.repository.InventoryRepository;
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
    private InventoryRepository inventoryRepository;

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
        validateInventory(orderDTO);

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setName(orderDTO.getName());
        InventoryEntity inventoryEntity = inventoryRepository
                .findById(orderDTO.getInventoryId())
                .orElseThrow(() -> new RuntimeException("There is no such inventory in the DB"));
        orderEntity.setInventory(inventoryEntity);

        orderRepository.save(orderEntity);
        return new OrderDTO(orderEntity);
    }

    private void validateInventory(OrderDTO orderDTO) {
        Boolean productAvailable = inventoryService.isProductAvailable(orderDTO.getInventoryId());
        if (!productAvailable) {
            throw new RuntimeException("Product with inventoryId " + orderDTO.getInventoryId() + " is not available");
        }
    }

}
