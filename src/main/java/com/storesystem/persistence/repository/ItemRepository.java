/*
    This interface serves as a Jpa Respository for the Items 
    that serves to perform transactions in the DB
*/

package com.storesystem.persistence.repository;

import com.storesystem.persistence.model.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long>{
    
}
