package com.storesystem.persistence.services;

import com.storesystem.persistence.model.SizeEntity;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public interface SizeService {
    public void seedSizes();
    public List<SizeEntity> getAllSizes();
}