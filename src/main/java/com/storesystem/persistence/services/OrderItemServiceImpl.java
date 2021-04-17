package com.storesystem.persistence.services;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.OrderItemEntity;
import com.storesystem.persistence.repository.OrderItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemRepository repo;
    
    @Override
    public ApplicationMessages add(List<OrderItemEntity> orderItems) {
            repo.saveAll(orderItems);
            
            return ApplicationMessages.DATA_ADDED;
    }

}