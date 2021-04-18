/*
    This interface serves as a Jpa Respository for the ItemSizeAllocation 
    that serves to perform transactions in the DB
*/

package com.storesystem.persistence.repository;

import com.storesystem.persistence.model.ItemSizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemSizeRepository extends JpaRepository<ItemSizeEntity, Long>{

}