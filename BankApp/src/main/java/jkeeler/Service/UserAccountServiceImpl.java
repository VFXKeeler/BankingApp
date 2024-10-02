package jkeeler.Service;


import jkeeler.entity.UserAccount;
import jkeeler.Service.UserAccountService;
import jkeeler.RelationMapping.JPARepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    private JPARepository<UserAccount, Long> jPARepository;
 
    @Override
    public UserAccount createAccount(UserAccount userAccount) {
       System.out.println(userAccount.getUsername());
        return jPARepository.save(userAccount); 
    }

    @Override
    public UserAccount logIn(String username, String password) {
        UserAccount output = new UserAccount();
        System.err.println("needs to get all user from CRUD// message UserAccountServiceImpl");
        return output; 
    }

}
