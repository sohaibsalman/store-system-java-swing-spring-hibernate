package com.storesystem.persistence.services;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public void saveInDb();
    public int validateUser(String username, String password);
}