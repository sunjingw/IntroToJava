package Chapter5;

import java.util.Scanner;

public class Ex5_43 {
    public static void main(String[] args) {

        //Math - combinations
        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int i = 1; i <= 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                System.out.println(i + " " + j);

                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}
