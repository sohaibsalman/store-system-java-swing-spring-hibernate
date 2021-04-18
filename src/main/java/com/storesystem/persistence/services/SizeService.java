/*
    This interface serves as abstraction to implement the 
    Size Service. The actual service class must implement 
    all the methods added in this interface to work.
*/

package com.storesystem.persistence.services;

import com.storesystem.persistence.model.SizeEntity;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public interface SizeService {
    public void seedSizes();
    
    public List<SizeEntity> getAllSizes();
}