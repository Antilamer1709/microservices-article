package com.antilamer.orders.service;

import com.antilamer.orders.dto.OrderDTO;

public interface OrdersService {

    OrderDTO getOrder(Integer orderId);

    String createOrder(OrderDTO orderDTO);

}
