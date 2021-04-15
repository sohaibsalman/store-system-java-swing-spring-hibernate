package com.storesystem.persistence.services;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.ItemEntity;
import com.storesystem.persistence.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService{
    
    @Autowired
    private ItemRepository repo;

    @Override
    public ApplicationMessages addItem(ItemEntity item) {
        
        try {
            repo.save(item);
        } catch (Exception e) {
            return ApplicationMessages.SAVE_ERROR;
        }
        return ApplicationMessages.DATA_ADDED;
    }

}