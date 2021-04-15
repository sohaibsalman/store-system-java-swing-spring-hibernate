package com.storesystem.persistence.repository;

import com.storesystem.persistence.model.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<ItemEntity, Long>{
    
}
