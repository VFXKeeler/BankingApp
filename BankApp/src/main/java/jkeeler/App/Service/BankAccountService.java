package jkeeler.App.Service;

import jkeeler.App.Entity.BankAccount;
import jkeeler.App.Entity.UserAccount;

public interface BankAccountService {
    BankAccount findByUserId(int userId);
    public BankAccount createAccount(UserAccount username);
}
