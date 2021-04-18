/*
    This interface serves as a Jpa Respository for the Orders 
    that serves to perform transactions in the DB
*/

package com.storesystem.persistence.repository;

import com.storesystem.persistence.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long>{

}