package Chapter11.Chapter11_08;

import java.util.ArrayList;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    ArrayList<Transaction> transaction;

    public Account() {
        transaction = new ArrayList<>();
    }
    public Account(String name, int id, double balance) {
        this();
        this.name = name;
        this.id = id;
        this.balance = balance;

    }
    public int getId() {

        return id;
    }
    public double getBalance() {

        return balance;
    }
    public double getAnnualInterestRate() {

        return annualInterestRate;
    }
    public void setId(int id) {

        this.id = id;
    }
    public void setBalance(double balance) {

        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate() {

        return annualInterestRate / 1200;
    }
    public double getMonthlyInterest() {

        return annualInterestRate / 1200 * balance;
    }

    public void withdraw(double amount) {

        balance -= amount;
        transaction.add(new Transaction('W',amount, getBalance(), "Withdraw"));


    }
    public void deposit(double amount) {

        balance += amount;
        transaction.add(new Transaction('D',amount, getBalance(),"Deposit"));

    }

    public String toString() {
        return "name: " + name + "\nid: " + getId() + "\nbalance: " + getBalance();
    }

}

