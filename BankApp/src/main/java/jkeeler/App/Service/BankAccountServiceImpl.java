package jkeeler.App.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jkeeler.App.Entity.BankAccount;
import jkeeler.App.RelationMapping.BankAccountRepository;

@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Override
    public BankAccount findByUserId(int userId) {
        return bankAccountRepository.findByUserId(userId);
    }
}