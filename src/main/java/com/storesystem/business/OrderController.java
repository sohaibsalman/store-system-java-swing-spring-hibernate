/*
    This class acts as a business layer controller for the orders.
    It will invoke the persistence layer of db to add and get all orders
    from the database and pass it to the presentation layer (Java Swing)
*/

package com.storesystem.business;

import com.storesystem.persistence.model.OrderEntity;
import com.storesystem.persistence.services.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    /* Inject the order service in the controller by using spring boot dependency injection */
    @Autowired
    private OrderService orderService;
    
    /*
        Function that invoke the order service to add the 
        passed object in DB
    */
    public OrderEntity add(OrderEntity order)
    {
        return orderService.add(order);
    }

    /*
        Function that invoke the order service to get list
        if all orders from the DB
    */
    public List<OrderEntity> getAll() {
        return orderService.getAll();
    }
}