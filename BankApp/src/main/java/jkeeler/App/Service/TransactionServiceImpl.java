package jkeeler.App.Service;

import jkeeler.App.Entity.Transaction;
import jkeeler.App.RelationMapping.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Transaction> findByBankId(int bankId) {
        return transactionRepository.findByBankId(bankId);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    // Implement other methods as needed
}
