package Chapter11.Chapter11_08;

import java.util.Date;

public class Transaction extends Account {
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    public double getBalance() {
        return balance;
    }
    public Date getDateCreated() {
        return date;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void withdraw(double amount) {
        this.balance -= getAmount();

    }
    public void deposit(double amount) {
        this.balance += getAmount();
    }

    @Override
    public String toString() {
        return "\ntransaction: " + type + "\tamount: " + getAmount() + "\tbalance: " + balance + "\tdescription: " + description;
    }
}
