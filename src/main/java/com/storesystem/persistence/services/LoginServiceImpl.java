package com.storesystem.persistence.services;

import com.storesystem.ApplicationHelpers;
import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.model.LoginEntity;
import com.storesystem.persistence.repository.LoginRepository;
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
    public ApplicationMessages validateUser(String username, String password) {
        LoginEntity user = loginRepo.findByUsername(username);
       
       if(user == null)
           return ApplicationMessages.INVALID_USERNAME;
       
       if(!user.getPassword().equals(password)) 
           return ApplicationMessages.INVALID_PASSWORD;
       
       if(user.isIsAdmin())
           ApplicationHelpers.isAdmin = true;
       else
           ApplicationHelpers.isAdmin = false;
       
       // save the username of the logged in user
       ApplicationHelpers.username = user.getUsername();
       
       return ApplicationMessages.SUCCESSFUL_LOGIN;
    }
}