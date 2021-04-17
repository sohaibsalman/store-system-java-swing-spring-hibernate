package com.storesystem.persistence.services;

import com.storesystem.persistence.model.OrderEntity;
import com.storesystem.persistence.model.OrderItemEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    public OrderEntity add(OrderEntity order);

    public List<OrderEntity> getAll();
}