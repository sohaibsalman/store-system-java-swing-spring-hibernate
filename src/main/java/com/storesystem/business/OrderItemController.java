package com.storesystem.business;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.OrderItemEntity;
import com.storesystem.persistence.services.OrderItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderItemController  {
    
    @Autowired
    private OrderItemService service;
    
    public ApplicationMessages add(List<OrderItemEntity> orderItems)
    {
        return service.add(orderItems);
    }
}