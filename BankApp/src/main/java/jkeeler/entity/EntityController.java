package jkeeler.entity;

import jkeeler.Service.UserAccountServiceImpl; 
import jkeeler.entity.UserAccount;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/your-entity")
public class EntityController {


    @Autowired
    private UserAccountServiceImpl service;
    
    //@GetMapping
    //public List<UserAccount> getAll() {
        //return service.findAll();

}
