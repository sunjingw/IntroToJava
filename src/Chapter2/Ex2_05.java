package Chapter2;

import java.util.Scanner;

public class Ex2_05 {
    public static void main(String[] args) {

        //Financial application - calculate tips
        Scanner input = new Scanner(System.in);

        System.out.println("Enter subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        double tips = gratuity * subtotal / 100.0;

        System.out.println("The gratuity is : $" + tips + " and total is $" + (subtotal + tips));

    }
}
