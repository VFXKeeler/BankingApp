package jkeeler.App.Service;

import java.util.List;

import jkeeler.App.Entity.Transaction;

public interface TransactionService {
    List<Transaction> findByBankId(Long bankId);
    void addTransaction(Transaction transaction);
    // Add other transaction-related methods as needed
}
