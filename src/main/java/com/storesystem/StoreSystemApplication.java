package com.storesystem;

import com.storesystem.persistence.services.LoginService;
import com.storesystem.persistence.services.SizeService;
import com.storesystem.ui.LoginScreen;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreSystemApplication {
    
    @Autowired
    private LoginService loginService;
    
    @Autowired
    private SizeService sizeService;

	public static void main(String[] args) {
            ApplicationContext context = new SpringApplicationBuilder(StoreSystemApplication.class)
                    .headless(false)
                    .run(args);
            
            LoginScreen login = context.getBean(LoginScreen.class);
            login.setVisible(true);
	}
        
        @PostConstruct
        public void initDB()
        {
            this.loginService.saveInDb();
            this.sizeService.seedSizes();
        }
}
