package jkeeler.App;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "jkeeler.App.RelationMapping")
@EntityScan("jkeeler.App.entity")
public class BankingSpringApp {

    public static void main(String[] args) {
        
        SpringApplication.run(BankingSpringApp.class, args);
    }
    
}
