/*
    This interface serves as abstraction to implement the 
    OrderItem Service. The actual service class must implement 
    all the methods added in this interface to work.
*/

package com.storesystem.persistence.services;

import com.storesystem.utils.ApplicationMessages;
import com.storesystem.persistence.model.OrderItemEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface OrderItemService {
    public ApplicationMessages add(List<OrderItemEntity> orderItems);

    public List<OrderItemEntity> getAll();
}