package com.storesystem.business;

import com.storesystem.persistence.model.OrderEntity;
import com.storesystem.persistence.model.OrderItemEntity;
import com.storesystem.persistence.services.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    /* Inject the order service in the controller by using spring boot dependency injection */
    @Autowired
    private OrderService orderService;
    
    public OrderEntity add(OrderEntity order)
    {
        return orderService.add(order);
    }

    public List<OrderEntity> getAll() {
        return orderService.getAll();
    }
}