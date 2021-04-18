/*
    This interface serves as abstraction to implement the 
    Login Service. The actual service class must implement 
    all the methods added in this interface to work.
*/

package com.storesystem.persistence.services;

import com.storesystem.utils.ApplicationMessages;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public void saveInDb();
    
    public ApplicationMessages validateUser(String username, String password);
}