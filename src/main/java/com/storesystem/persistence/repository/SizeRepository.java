package com.storesystem.persistence.repository;

import com.storesystem.persistence.model.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SizeRepository extends JpaRepository<SizeEntity, Long> {

}