/*
    This interface serves as abstraction to implement the 
    Order Service. The actual service class must implement 
    all the methods added in this interface to work.
*/

package com.storesystem.persistence.services;

import com.storesystem.persistence.model.OrderEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    public OrderEntity add(OrderEntity order);

    public List<OrderEntity> getAll();
}