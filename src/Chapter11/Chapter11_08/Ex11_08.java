package Chapter11.Chapter11_08;

import java.util.Scanner;

public class Ex11_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account acc = new Account("George", 1122, 1000);

        System.out.println(acc.toString());

        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);

        System.out.println(acc.transaction.toString());
    }
}
