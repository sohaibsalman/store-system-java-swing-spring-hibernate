package com.storesystem.persistence.services;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.OrderEntity;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    public ApplicationMessages add(OrderEntity order);
}