/*
    This class acts as a business layer controller for the items size allocation.
    It will invoke the persistence layer of db to add and get all items 
    from the database and pass it to the presentation layer (Java Swing)
*/

package com.storesystem.business;

import com.storesystem.utils.ApplicationMessages;
import com.storesystem.persistence.model.ItemSizeEntity;
import com.storesystem.persistence.services.ItemSizeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class ItemSizeController {
    
    // Inject the item-size service that talks with the DB
    @Autowired
    private ItemSizeService service;
    
    /*
        This function serves as a business layer for adding 
        items-size allocation, it receives an item object and will call the 
        required service to save the data in DB
    */
    public ApplicationMessages add(List<ItemSizeEntity> list)
    {
        return service.add(list);
    }
    
    /*
        This function serves as a business layer for getting all 
        item-size allocation, it will call the required service to 
        get the data from DB
    */
    public List<ItemSizeEntity> getAll()
    {
        return service.getAll();
    }
}