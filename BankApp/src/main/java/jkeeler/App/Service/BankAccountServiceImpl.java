package jkeeler.App.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jkeeler.App.Entity.BankAccount;
import jkeeler.App.Entity.UserAccount;
import jkeeler.App.RelationMapping.BankAccountRepository;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Override
    public BankAccount findByUserId(Long userId) {
        return bankAccountRepository.findByUserId(userId);
    }

    @Override
    public BankAccount createAccount(UserAccount user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        BankAccount bank = new BankAccount(0.0, user.getUserId());
        return bankAccountRepository.save(bank);
    }
}
