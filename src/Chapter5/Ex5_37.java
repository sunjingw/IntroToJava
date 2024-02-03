package Chapter5;

import java.util.Scanner;

public class Ex5_37 {
    public static void main(String[] args) {

        //Decimal to binary
        Scanner input = new Scanner(System.in);

        //Prompt user for a number
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        String binary = "";

        boolean decToBinary = true;

        while (num != 0) {
            if (num % 2 == 0) {
                binary = "0" + binary;
            } else {
                binary = "1" + binary;
            }

            num = num / 2;
        }

        System.out.println(binary);
    }
}
