/*
    This interface serves as a Jpa Respository for the Login 
    that serves to perform transactions in the DB
*/

package com.storesystem.persistence.repository;

import com.storesystem.persistence.model.LoginEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Long>{
    
    LoginEntity findByUsername(String username);
}