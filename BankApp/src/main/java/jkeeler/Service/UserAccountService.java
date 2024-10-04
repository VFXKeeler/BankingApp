package jkeeler.Service;

import jkeeler.entity.UserAccount;
import java.util.List;

public interface UserAccountService {
    // General Account Functions
    public UserAccount createAccount(UserAccount userAccount);
    public UserAccount changePassword(UserAccount userAccount, String password);
    public UserAccount changeUsername(UserAccount userAccount, String username);
    public UserAccount logIn(String username, String password);
    public boolean deleteAccount(Long id);

    // Super Functions
    public List<UserAccount> viewAllUsers();
    public void deleteUser(UserAccount userAccount);
    public UserAccount UpdateUser(UserAccount userAccount);
    public UserAccount makeSuperUser(UserAccount userAccount);


}
