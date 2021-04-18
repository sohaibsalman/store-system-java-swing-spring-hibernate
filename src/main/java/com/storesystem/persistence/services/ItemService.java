/*
    This interface serves as abstraction to implement the 
    Item Service. The actual service class must implement 
    all the methods added in this interface to work.
*/

package com.storesystem.persistence.services;

import com.storesystem.utils.ApplicationMessages;
import com.storesystem.persistence.model.ItemEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    public ItemEntity add(ItemEntity item);
    
    public List<ItemEntity> getAll();

    public ItemEntity get(Long id);

    public ApplicationMessages update(ItemEntity item);

    public ApplicationMessages delete(Long id);
}