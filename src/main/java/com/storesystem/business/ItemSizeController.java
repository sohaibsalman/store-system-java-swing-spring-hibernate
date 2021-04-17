package com.storesystem.business;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.ItemSizeEntity;
import com.storesystem.persistence.services.ItemSizeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class ItemSizeController {
    
    @Autowired
    private ItemSizeService service;
    
    public ApplicationMessages add(List<ItemSizeEntity> list)
    {
        return service.add(list);
    }
}