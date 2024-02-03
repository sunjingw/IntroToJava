package Chapter10;

import java.util.Scanner;

public class Ex10_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        int id = enterId();

        while (true) {

            displayMenu();
            System.out.println("Enter a choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("The balance is " + accounts[id].getBalance());
            } else if (choice == 2) {
                System.out.println("Enter an amount to withdraw: ");
                accounts[id].withdraw(input.nextDouble());
            } else if (choice == 3) {
                System.out.println("Enter an amount to deposit: ");
                accounts[id].deposit(input.nextDouble());
            } else if (choice == 4) {
                id = enterId();

            }
        }
    }

    public static void displayMenu() {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }

    public static int enterId() {
        Scanner input = new Scanner(System.in);
        int id = -1;

        while (!(id >= 0 && id <= 10)) {

            System.out.println("Enter an id: ");
            id = input.nextInt();
            if (id >= 0 && id <= 10)
                return id;
            else {
                System.out.println("Enter a correct id: ");
                id = input.nextInt();
            }
        }

        return id;
    }
}
