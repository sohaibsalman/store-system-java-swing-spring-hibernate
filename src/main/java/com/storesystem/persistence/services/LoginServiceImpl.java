package com.storesystem.persistence.services;

import com.storesystem.persistence.model.LoginEntity;
import com.storesystem.persistence.repository.LoginRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
 public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepo;
    
    @Override
    public void saveInDb() {
        // Check if login credentials exists in DB or not
        if(loginRepo.count() == 0)
        {
            // Create admin account
            String username = "admin";
            String password = "admin";
            
            // Save admin credentials
            loginRepo.save(new LoginEntity(username, password, true));
            
            // Create sales personnel account
            username = "sales";
            password = "sales";
            
            // Save sales personnel credentials
            loginRepo.save(new LoginEntity(username, password, false));
        }
    }

    @Override
    public int validateUser(String username, String password) {
        LoginEntity user = loginRepo.findByUsername(username);
       
       if(user == null)
       {
           return -1;
       }
       
       if(!user.getPassword().equals(password)) 
       {
           return 1;
       }
       
       return 0;
    }
}