package Chapter11.Chapter11_03;

import Chapter9.Account;
import java.util.Scanner;

public class Checking extends Account {

    private int overdraft;
    public Checking() {
        super();
        overdraft = 100;
    }

    public Checking(int id, double balance, int overdraft) {
        super(id, balance);
        this.overdraft = overdraft;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {

        if (getBalance() - amount < 0 - overdraft) {
            System.out.println("Overdraft limited");
        } else {
            withdraw(amount);
        }
    }

    public String toString() {
        return super.toString() + "\noverdraft limit: " + getOverdraft();
    }
}
