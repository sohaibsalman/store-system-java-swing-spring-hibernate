/*
    This interface serves as a Jpa Respository for the OrderItems 
    that serves to perform transactions in the DB
*/

package com.storesystem.persistence.repository;

import com.storesystem.persistence.model.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Long>{

}