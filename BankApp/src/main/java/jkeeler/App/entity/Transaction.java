package jkeeler.App.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId = 0;
    @Column(name = "Date")
    private String date = "";
    @Column(name = "Amount")
    private double amount = 0;
    @Column(name = "bankAccountId")
    private Long bankId = 0L;

    public Transaction(){
        super();
    }
    public Transaction(double amount, Long bankId){
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
    public Long getBankId(){
        return bankId;
    }
    public void setBankId(Long bankId){
        this.bankId = bankId;
    }




}
