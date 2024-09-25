package jkeeler.entity;

public class BankAccount {
    int bankAccountId = 0;
    double balance = 0;
    int userId = 0;
    public BankAccount(){
        super();

    }
    public BankAccount(double balance, int userId){
        super();
        this.balance = balance;
        this.userId = userId;
    }
    public BankAccount(double balance){
        super();
        this.balance = balance;
    }
    public int getBankAccountId(){
        return this.bankAccountId;
    }
    public setBankAccountId(int bankAccountId){
        this.bankAccountId = bankAccountId;
    }
    public double getBalance(){
        return this.balance;
    }
    public setBalance(double balance){
        this.balance = balance;
    }
    public int userId(){
        return userId;
    }
    public setUserId(int userId)
    {
        this.userId = userId;
    }
   

}
