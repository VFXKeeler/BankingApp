package jkeeler.App.Service;


import jkeeler.App.Entity.BankAccount;
import jkeeler.App.Entity.UserAccount;

public interface BankAccountService {
    public BankAccount findByUserId(Long userId);
    public BankAccount createAccount(UserAccount username);
}
