package jkeeler;

import jkeeler.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jkeeler.UserController;

@SpringBootApplication
public class HelloWorld {
    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(HelloWorld.class, args);
       UserService userService = context.getBean(UserService.class);

       User user = new User("Mitchell Malisyh", "Dakota<3", false);
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.isSuperUser());
       if(user != null){
        System.out.println(user.getName());
       }      
       userService.createUser(user);
        
    }
}