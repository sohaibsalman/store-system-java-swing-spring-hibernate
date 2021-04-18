package com.storesystem;

import com.storesystem.persistence.services.LoginService;
import com.storesystem.persistence.services.SizeService;
import com.storesystem.ui.LoginScreen;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreSystemApplication {
    
    // Inject login service using spring dependency injection
    @Autowired
    private LoginService loginService;
    
    // Inject size service using spring dependency injection
    @Autowired
    private SizeService sizeService;

    /*
        Main function of the application. The application will start
        from this function. This function gets the loginScreen object
        from spring bean container and displays the login screen to 
        start the application
    */
    public static void main(String[] args) {
        // Config spring boot applicaton for java swing
        ApplicationContext context = new SpringApplicationBuilder(StoreSystemApplication.class)
                .headless(false)
                .run(args);

        // Get login screen object from spring bean container
        LoginScreen login = context.getBean(LoginScreen.class);
        
        // Show the login screen
        login.setVisible(true);
    }

    /*
        This function will be executed in parallel to the main function.
        It is used to initialize the database with some data in it. This
        function will call services to create "admin" and "sales person" 
        user account as well as it will create some initial item sizes.
    */
    @PostConstruct
    public void initDB()
    {
        this.loginService.saveInDb();   // seed initial users in table
        this.sizeService.seedSizes();   // seed initial sizes
    }
}
