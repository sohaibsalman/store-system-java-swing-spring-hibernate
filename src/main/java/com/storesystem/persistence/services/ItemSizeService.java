package com.storesystem.persistence.services;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.ItemSizeEntity;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ItemSizeService {
    public ApplicationMessages add(List<ItemSizeEntity> list);

    public List<ItemSizeEntity> getAll();
}