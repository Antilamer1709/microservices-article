package com.antilamer.orders.service;

import com.antilamer.orders.dto.OrderDTO;

public interface OrdersService {

    OrderDTO getOrder(Integer orderId);

    OrderDTO createOrder(OrderDTO orderDTO);

}
