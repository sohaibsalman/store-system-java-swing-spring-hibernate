/*
    This class acts as a business layer controller for the items.
    It will invoke the persistence layer of db to add, update, delete,
    get items from the database and pass it to the presentation layer (Java Swing)
*/

package com.storesystem.business;

import com.storesystem.utils.ApplicationMessages;
import com.storesystem.persistence.model.ItemEntity;
import com.storesystem.persistence.services.ItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ItemController {
    
    // Inject the item service that talks with the DB
    @Autowired
    private ItemService service;
    
    /*
        This function serves as a business layer for adding 
        items, it receives an item object and will call the 
        required service to save the item data in DB
    */
    public ItemEntity add(ItemEntity item)
    {
        return service.add(item);
    }
    
    /*
        This function serves as a business layer for getting 
        all the items, it will call the required service to 
        get list of items data from DB
    */
    public List<ItemEntity> getAll()
    {
        return service.getAll();
    }
    
    /*
        This function serves as a business layer for getting 
        a single item, it will call the required service to 
        get an item data from DB
    */
    public ItemEntity get(Long id)
    {
        return service.get(id);
    }
    
    /*
        This function serves as a business layer for updating 
        an item passed as an object, it will call the required service to 
        update the passed item data in DB
    */
    public ApplicationMessages update(ItemEntity item)
    {
        return service.update(item);
    }
    
    /*
        This function serves as a business layer for deleting 
        an item whose id is passed, it will call the required service to 
        delete the item data from DB
    */
    public ApplicationMessages delete(Long id)
    {
        return service.delete(id);
    }
}