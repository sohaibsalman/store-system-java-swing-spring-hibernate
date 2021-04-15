package com.storesystem.persistence.services;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.ItemEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    public ApplicationMessages add(ItemEntity item);
    
    public List<ItemEntity> getAll();

    public ItemEntity get(Long id);

    public ApplicationMessages update(ItemEntity item);

    public ApplicationMessages delete(Long id);
}