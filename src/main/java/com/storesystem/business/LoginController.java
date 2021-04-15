package com.storesystem.business;

import com.storesystem.ApplicationMessages;
import com.storesystem.persistence.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class LoginController {

    @Autowired
    private LoginService loginService;
    
    public ApplicationMessages login(String username, String password)
    {
        return loginService.validateUser(username, password);
    }
}