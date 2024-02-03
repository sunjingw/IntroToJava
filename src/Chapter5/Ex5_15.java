package Chapter5;

import java.util.Scanner;

public class Ex5_15 {
    public static void main(String[] args) {

        //Display ASCII character table
        Scanner input = new Scanner(System.in);

        //Print the ASCII characters ! to ~, display ten characters per line

        int count = 1;
        for (int i = 33; i < 127; i++) {
            System.out.print((char)i + " ");

            if (count % 10 == 0)
                System.out.println();

            count++;
        }
    }
}
