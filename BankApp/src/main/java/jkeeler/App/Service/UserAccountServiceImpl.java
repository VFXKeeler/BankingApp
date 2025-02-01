package jkeeler.App.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jkeeler.App.Entity.UserAccount;
import jkeeler.App.RelationMapping.UserRepository;

@Service
public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    private UserRepository<UserAccount, Long> userRepository;
 
    @Override
    public UserAccount createAccount(String username, String password,String email,boolean superUser) {
        UserAccount User = new UserAccount(username, password, email, superUser);
        return userRepository.save(User); 
    }



@Override
    public UserAccount findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
}
