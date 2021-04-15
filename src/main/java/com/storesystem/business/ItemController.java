package com.storesystem.business;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.ItemEntity;
import com.storesystem.persistence.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ItemController {
    
    @Autowired
    private ItemService service;
    
    public ApplicationMessages addItem(ItemEntity item)
    {
        return service.addItem(item);
    }
}