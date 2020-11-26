package com.antilamer.microservices.service;

import com.antilamer.microservices.domain.OrderEntity;
import com.antilamer.microservices.dto.OrderDTO;
import com.antilamer.microservices.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private InventoryService inventoryService;

    public OrderDTO getOrder(Integer orderId) {
        OrderEntity orderEntity = orderRepository.findById(orderId);
        return new OrderDTO(orderEntity);
    }

    public String createOrder(OrderDTO orderDTO) {
        Boolean productAvailable = inventoryService.isProductAvailable(orderDTO.getProductId());
        if (!productAvailable) {
            return "Product with id " + orderDTO.getProductId() + " is not available";
        }
        orderRepository.save(new OrderEntity(orderDTO.getProductId(), orderDTO.getName()));
        return "Order of product with id " + orderDTO.getProductId() + " has been created!";
    }

}
