package com.storesystem.business;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.ItemEntity;
import com.storesystem.persistence.services.ItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ItemController {
    
    @Autowired
    private ItemService service;
    
    /*
        This function serves as a business layer for adding 
        items, it will call the required service to 
        save the item data in DB
    */
    public ApplicationMessages add(ItemEntity item)
    {
        return service.add(item);
    }
    
    /*
        This function serves as a business layer for getting 
        all the items, it will call the required service to 
        list items data from DB
    */
    public List<ItemEntity> getAll()
    {
        return service.getAll();
    }
    
    public ItemEntity get(Long id)
    {
        return service.get(id);
    }
    
    public ApplicationMessages update(ItemEntity item)
    {
        return service.update(item);
    }
    
    public ApplicationMessages delete(Long id)
    {
        return service.delete(id);
    }
}