package Chapter9;

import java.util.Scanner;

public class Ex9_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account acc = new Account(1122, 20000);
        acc.setAnnualInterestRate(4.5);

        System.out.println("Account balance: " + acc.getBalance());
        acc.withdraw(2500);
        System.out.println("After withdrawing $2500: $" + acc.getBalance());
        acc.deposit(3000);
        System.out.println("After depositing $3000: $" + acc.getBalance());
        System.out.println("Monthly interest: $" + acc.getMonthlyInterest());
        System.out.println("Account created: " + acc.getDateCreated().toString());
    }
}
