/*
    This interface serves as abstraction to implement the 
    ItemSize Service. The actual service class must implement 
    all the methods added in this interface to work.
*/

package com.storesystem.persistence.services;

import com.storesystem.utils.ApplicationMessages;
import com.storesystem.persistence.model.ItemSizeEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ItemSizeService {
    public ApplicationMessages add(List<ItemSizeEntity> list);

    public List<ItemSizeEntity> getAll();
}