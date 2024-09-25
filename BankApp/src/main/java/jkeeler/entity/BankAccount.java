package jkeeler.entity;

public class BankAccount {
    private int bankAccountId = 0;
    private double balance = 0;
    private int userId = 0;
    public BankAccount(){
        super();

    }
    public BankAccount(double balance, int userId){
        super();
        this.balance = balance;
        this.setUserId(userId);
    }
    public BankAccount(double balance){
        super();
        this.balance = balance;
    }
    public int getBankAccountId(){
        return this.bankAccountId;
    }
    public void setBankAccountId(int bankAccountId){
        this.bankAccountId = bankAccountId;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public int userId(){
        return userId;
    }
    public void setUserId(int userId)
    {
        this.userId = userId;
    }
   

}
