package jkeeler.Service;


import jkeeler.entity.UserAccount;
import jkeeler.Service.UserAccountService;

import jkeeler.entity.UserAccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    //@Autowired
    private UserAccountRepository repository;
    @Override
    public UserAccount createAccount(String username, String password) {
        UserAccount output = new UserAccount();
        output.setUsername(username);
        output.setPassword(password);
        return output; 
    }

    @Override
    public UserAccount logIn(String username, String password) {
        UserAccount output = new UserAccount();
        System.err.println("needs to get all user from CRUD// message UserAccountServiceImpl");
        return output; 
    }

}
