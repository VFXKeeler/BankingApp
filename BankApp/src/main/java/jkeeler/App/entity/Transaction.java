package jkeeler.App.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    private int transactionId = 0;
    @Column(name = "Date")
    private String date = "";
    @Column(name = "Amount")
    private double amount = 0;
    @Column(name = "BankId")
    private int bankId = 0;

    public Transaction(){
        super();
    }
    public Transaction(double amount, int bankId){
        this.amount = amount;
        this.bankId = bankId;
    }
    public int getTransactionId()
    {
        return this.transactionId;
    }
    public void setTransactionId(int transactionId)
    {
        this.transactionId =transactionId;
    }
    public String getDate(){
        return this.date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public double getAmount(){
        return this.amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public int getBankId(){
        return bankId;
    }
    public void setBankId(int bankId){
        this.bankId = bankId;
    }




}
