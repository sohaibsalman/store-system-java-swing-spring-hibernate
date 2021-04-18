/*
    This class acts as a business layer controller for the sizes.
    It will invoke the persistence layer of db to get all sizes 
    from the database and pass it to the presentation layer (Java Swing)
*/

package com.storesystem.business;

import com.storesystem.persistence.model.SizeEntity;
import com.storesystem.persistence.services.SizeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SizeController {
    @Autowired 
    private SizeService sizeService;
    
    public List<SizeEntity> getAllSizes()
    {
        return sizeService.getAllSizes();
    }
}