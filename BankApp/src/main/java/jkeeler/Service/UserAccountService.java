package jkeeler.Service;

import jkeeler.entity.UserAccount;

public interface UserAccountService {
    public UserAccount createAccount(String username, String password);
    public UserAccount logIn(String username, String password);
}
