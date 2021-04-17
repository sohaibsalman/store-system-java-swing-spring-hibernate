package com.storesystem.business;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.ItemEntity;
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
    
    public OrderEntity add(OrderEntity order)
    {
        
//        OrderEntity order = new OrderEntity();
//        order.setGrandTotal(grandTotal);
//        
//        // Iterate the items list and add items reference to order
//        for (ItemEntity item : items) {
//            
//            ItemEntity temp = new ItemEntity(item);
//            // Add an item to order
//            order.getItems().add(temp);
//            
////            // Add order reference to item
////            item.getOrders().add(order);
//        }
//        
//        // Call the Orders Service to add data in DB
        return orderService.add(order);
    }
}