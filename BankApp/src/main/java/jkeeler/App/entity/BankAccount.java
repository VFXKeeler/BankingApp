package jkeeler.App.Entity;

import javax.persistence.*;



@Entity
@Table(name = "bankaccount")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bankAccountId;
    private double balance;

    @Column(name = "userid")
    private Long userId;

    public BankAccount() {
        super();
    }

    public BankAccount(double balance, Long userId) {
        super();
        this.balance = balance;
        this.userId = userId;
    }

    public Long getBankAccountId() {
        return this.bankAccountId;
    }

    public void setBankAccountId(Long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
