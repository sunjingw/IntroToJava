package Chapter5;

import java.util.Scanner;

public class Ex5_41 {
    public static void main(String[] args) {

        //Occurrence of max numbers
        Scanner input = new Scanner(System.in);

        //Max number
        int max = 0;

        //Count occurrence
        int count = 0;

        //Store num as input
        int num = -1;

        System.out.print("Enter numbers: ");
        while (num != 0) {
            num = input.nextInt();

            if (num > max) {
                max = num;
                count = 1;
            } else if (num == max) {
                count++;
            }

        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of largest number is " + count);
    }
}
