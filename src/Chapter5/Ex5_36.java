package Chapter5;

import java.util.Scanner;

public class Ex5_36 {
    public static void main(String[] args) {

        //Business application - checking ISBN
        Scanner input = new Scanner(System.in);


        int num = 0;

        //Prompt user for first 9 digits of the ISBN
        System.out.println("Enter the first 9 digits of the ISBN: ");
        String isbn = input.nextLine();

        int digits = Integer.parseInt(isbn);

        for (int i = 1; i <= 9; i++) {
            num += (digits / (1000000000 / Math.pow(10, i)) % 10) * i;
        }

        if (num % 11 == 10)
            System.out.println(isbn + "X");
        else
            System.out.println(isbn + num % 11);


    }
}
