/*
    This class acts as a business layer controller for the order-item-allocation.
    It will invoke the persistence layer of db to add and get all items from the 
    database and pass it to the presentation layer (Java Swing)
*/

package com.storesystem.business;

import com.storesystem.utils.ApplicationMessages;
import com.storesystem.persistence.model.OrderItemEntity;
import com.storesystem.persistence.services.OrderItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderItemController  {
    
    // Inject the order-item service that talks with the DB
    @Autowired
    private OrderItemService service;
    
    /*
        Function that will invoke the order-item service
        to add the passed list of order and its items in 
        the db
    */
    public ApplicationMessages add(List<OrderItemEntity> orderItems)
    {
        return service.add(orderItems);
    }
    
    /*
        Function that will invoke the order-item service
        get all the order-item allocation from the db
    */
    public List<OrderItemEntity> getAll()
    {
        return service.getAll();
    }
}