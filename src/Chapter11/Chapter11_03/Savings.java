package Chapter11.Chapter11_03;

import Chapter9.Account;
import java.util.Scanner;

public class Savings extends Account {

    public Savings() {
        super();
    }

    public Savings(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (getBalance() >= 0) {
            withdraw(amount);
        } else
            System.out.println("Cannot withdraw below $0");
    }
}
