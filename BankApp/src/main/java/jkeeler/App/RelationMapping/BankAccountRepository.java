package jkeeler.App.RelationMapping;


import org.springframework.data.jpa.repository.JpaRepository;
import jkeeler.App.Entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
    BankAccount findByUserId(Long userId);
}
