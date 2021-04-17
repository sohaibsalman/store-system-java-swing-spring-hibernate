package com.storesystem.persistence.services;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.OrderItemEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface OrderItemService {
    public ApplicationMessages add(List<OrderItemEntity> orderItems);
}