package com.storesystem.persistence.services;

import com.storesystem.persistence.model.SizeEntity;
import com.storesystem.persistence.repository.SizeRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class SizeServiceImpl implements SizeService{

    @Autowired
    private SizeRepository sizeRepo;
    
    @Override
    public void seedSizes() {
        
        // Check if sizes are not already added
        if(sizeRepo.count() == 0)
        {
            // Add some sizes into sizes table
            int [] sizes = {4, 6, 8, 10, 12};
            
            for (int size : sizes) {
                sizeRepo.save(new SizeEntity(size));
            }
        }
    }

}