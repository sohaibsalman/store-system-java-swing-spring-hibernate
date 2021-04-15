package com.storesystem.persistence.services;

import com.storesystem.ApplicationMessages;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public void saveInDb();
    public ApplicationMessages validateUser(String username, String password);
}