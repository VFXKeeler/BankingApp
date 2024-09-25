package jkeeler.entity;

public class Transaction {

    int transactionId = 0;
    String date = "";
    double amount = 0;
    int bankId = 0;

    public Transaction(){
        super;
    }
    public Transaction(double amount, int bankId){
        this.amount = amount;
        this.bankId = bankId;
    }
    public int getTransactionId()
    {
        return this.transactionId;
    }
    public int setTransactionId(int transactionId)
    {
        this.transactionId =transactionId;
    }
    public String getDate(){
        return this.date;
    }
    public setDate(String date){
        this.date = date;
    }
    public double getAmount(){
        return this.amout;
    }
    public setAmount(double amount){
        this.amount = amount;
    }
    public int getBankId(){
        return bankId;
    }
    public setBankId(int bankId){
        this.BankId = bankId;
    }




}
