package jkeeler.Service;


import jkeeler.entity.UserAccount;
import jkeeler.Service.UserAccountService;
import jkeeler.RelationMapping.JPARepository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public UserAccount changePassword(UserAccount userAccount, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changePassword'");
    }

    @Override
    public UserAccount changeUsername(UserAccount userAccount, String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeUsername'");
    }

    @Override
    public boolean deleteAccount(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public List<UserAccount> viewAllUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'viewAllUsers'");
    }

    @Override
    public void deleteUser(UserAccount userAccount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllUser'");
    }

    @Override
    public UserAccount UpdateUser(UserAccount userAccount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'UpdateUser'");
    }

    @Override
    public UserAccount makeSuperUser(UserAccount userAccount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSuperUser'");
    }

    public Optional<UserAccount> getUserById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    public UserAccount updateUser(Long id, UserAccount userDetails) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

}
