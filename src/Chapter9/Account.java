package Chapter9;

import java.util.Scanner;
import java.util.Date;
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Account() {

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public Date getDateCreated() {
        return dateCreated;
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
    public void withdraw(double balance) {
        this.balance -= balance;
    }
    public void deposit(double balance) {
        this.balance += balance;
    }

    public String toString() {
        return "id: " + getId() + "\nbalance: " + getBalance();
    }
}
