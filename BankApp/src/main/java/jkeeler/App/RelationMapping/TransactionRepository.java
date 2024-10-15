package jkeeler.App.RelationMapping;

import org.springframework.data.jpa.repository.JpaRepository;

import jkeeler.App.Entity.Transaction;

import java.util.List;

public interface TransactionRepository<T, Long> extends JpaRepository<Transaction, Long> {
    List<Transaction> findByBankId(int BankId);
}
