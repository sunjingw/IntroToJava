package Chapter3;

import java.util.Scanner;

public class Ex3_26 {
    public static void main(String[] args) {

        //Use boolean operators
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int num = input.nextInt();

        System.out.println("Is 10 divisible by 5 and 6? " + (num % 5 == 0 && num % 6 == 0 ? true : false));

        System.out.println("Is 10 divisible by 5 or 6? " + (num % 5 == 0 || num % 6 == 0 ? true : false));

        System.out.println("Is 10 divisible by 5 or 6, but not both? " + (num % 5 == 0 ^ num % 6 == 0 ? true : false));


    }
}
