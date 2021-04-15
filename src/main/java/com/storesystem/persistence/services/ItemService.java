package com.storesystem.persistence.services;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.ItemEntity;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    public ApplicationMessages addItem(ItemEntity item);
}