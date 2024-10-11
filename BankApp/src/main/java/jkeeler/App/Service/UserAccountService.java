package jkeeler.App.Service;

import java.util.List;

import jkeeler.App.entity.UserAccount;

public interface UserAccountService {
    // General Account Functions
    public UserAccount createAccount(String username, String password,boolean superUser);
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
