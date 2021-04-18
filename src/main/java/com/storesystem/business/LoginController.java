/*
    This class acts as a business layer controller for the login.
    It will invoke the persistence layer of db to validate the user
    credentials and then login to the application
*/

package com.storesystem.business;

import com.storesystem.utils.ApplicationMessages;
import com.storesystem.persistence.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    // Inject the login service that talks with the DB
    @Autowired
    private LoginService loginService;
    
    /*
        This function will call the login service to validate
        the user credentials and then pass a suitable message
        for the presentation layer about the result.
    */
    public ApplicationMessages login(String username, String password)
    {
        return loginService.validateUser(username, password);
    }
}