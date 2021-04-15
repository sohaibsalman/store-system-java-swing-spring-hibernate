package com.storesystem.business;

import com.storesystem.ApplicationHelpers;
import com.storesystem.persistence.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@ComponentScan("com.storesystem.birthdays")
public class LoginController {

    @Autowired
    private LoginService loginService;
    
    public int login(String username, String password)
    {
        
//        if(username.equals("admin") && password.equals("admin"))
//        {
//            ApplicationHelpers.isAdmin = true;
//            return 0;
//        }
//        else if (username.equals("sales") && password.equals("sales"))
//        {
//            ApplicationHelpers.isAdmin = false;
//            return 0;
//        }
//        return -1;
        
        return loginService.validateUser(username, password);
    }
}