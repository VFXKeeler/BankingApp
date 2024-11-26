package jkeeler.App.RelationMapping;

import org.springframework.data.jpa.repository.JpaRepository;
import jkeeler.App.Entity.BankAccount;

public interface BankAccountRepository<T, Long> extends JpaRepository<BankAccount, Long> {
    BankAccount findByUserId(int userId);
}
