package jkeeler.App;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jkeeler.RelationMapping.JPARepository;
import jkeeler.Service.*;

import jkeeler.entity.UserAccount;

@SpringBootApplication
public class BankingSpringApp {
    private UserAccount loggedInUser = null;
    private UserAccountServiceImpl UserService = new UserAccountServiceImpl();


    public static void main(String[] args) {
        
        SpringApplication.run(BankingSpringApp.class, args);
    }
    
}
