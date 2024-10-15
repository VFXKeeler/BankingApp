package jkeeler.App.Service;

import jkeeler.App.Entity.BankAccount;

public interface BankAccountService {
    BankAccount findByUserId(int userId);
}
