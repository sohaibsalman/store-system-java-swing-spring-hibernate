package com.storesystem.persistence.services;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.ItemEntity;
import com.storesystem.persistence.repository.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService{
    
    @Autowired
    private ItemRepository repo;

    @Override
    public ApplicationMessages add(ItemEntity item) {
        
        try {
            repo.save(item);
        } catch (Exception e) {
            return ApplicationMessages.SAVE_ERROR;
        }
        return ApplicationMessages.DATA_ADDED;
    }

    @Override
    public List<ItemEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public ItemEntity get(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public ApplicationMessages update(ItemEntity item) {
        ItemEntity itemInDb = repo.findById(item.getId()).get();
        
        
        return ApplicationMessages.DATA_UPDATED;
    }

    @Override
    public ApplicationMessages delete(Long id) {
        ItemEntity itemInDb = repo.findById(id).get();
        
        
        try {
            repo.delete(itemInDb);

        } catch (Exception e) {
            return ApplicationMessages.DELETE_ERROR;
        }
        return ApplicationMessages.DATA_DELETED;
    }

}