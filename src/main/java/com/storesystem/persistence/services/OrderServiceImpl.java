package com.storesystem.persistence.services;

import com.storesystem.persistence.model.OrderEntity;
import com.storesystem.persistence.model.OrderItemEntity;
import com.storesystem.persistence.repository.OrderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repo;
    
    @Override
    public OrderEntity add(OrderEntity order) {
        return repo.save(order);
    }

    @Override
    public List<OrderEntity> getAll() {
        return repo.findAll();
    }
}