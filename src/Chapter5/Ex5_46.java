package Chapter5;

import java.util.Scanner;

public class Ex5_46 {
    public static void main(String[] args) {

        //Reverse a string
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String order = input.nextLine();

        for (int i = order.length(); i > 0; i--) {
            System.out.print(order.charAt(i-1));
        }
    }
}
