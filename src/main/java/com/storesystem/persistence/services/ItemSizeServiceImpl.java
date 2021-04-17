package com.storesystem.persistence.services;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.ItemSizeEntity;
import com.storesystem.persistence.repository.ItemSizeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ItemSizeServiceImpl implements ItemSizeService {

    @Autowired
    private ItemSizeRepository repo;
     
   @Override
    public ApplicationMessages add(List<ItemSizeEntity> list) {
        
        try {
            repo.saveAll(list);
        } catch (Exception e) {
            return ApplicationMessages.SAVE_ERROR;
        }
        return ApplicationMessages.DATA_ADDED;
    }

    @Override
    public List<ItemSizeEntity> getAll() {
        return repo.findAll();
    }
}