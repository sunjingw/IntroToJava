package Chapter5;

import java.util.Scanner;

public class Ex5_16 {
    public static void main(String[] args) {

        //Find the factors of an integer
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int factor = 2;

        do {
            if (num % factor == 0) {
                num = num / factor;
                System.out.print(factor + " ");
                if (num == 1) {
                    break;
                }
            } else {
                factor++;
            }

        } while (factor > 1);
    }
}
